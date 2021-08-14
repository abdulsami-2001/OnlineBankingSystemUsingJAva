import java.util.Scanner;

class OnlineBankingSystem extends CreateAccount{

    String WS_CheckerV;
    double WS_Checker;
    String EUFirstName = "HUMS";
    String EULastName = "NO_HUMS";
    int EU_MobileNumber = 555;
    int EU_Pass = 999;
    double EU_Balance = 5000;
    double EU_FixedFee = 0.5;
    int IHMob;
    int IHPass;
    int EU_Checker;

    Scanner inputHolderE = new Scanner(System.in);

    OnlineBankingSystem(){
        System.out.println("\nWelcome To Loopy Bank\n");
    }
    
    public static void main(String[] args) {
        OnlineBankingSystem obj = new OnlineBankingSystem();
        CreateAccount obj1 = new CreateAccount();
        obj.checker();
    }

    void checker(){
        System.out.println("1. Create Account");
        System.out.println("2. Login\n");
        System.out.println("Enter Number To Choose: ");
        WS_CheckerV = inputHolderE.next();
        do{
            if(!WS_CheckerV.matches(intPattern)){
                System.out.println("\nPlease Enter Correct Data Type Input");
                System.out.println("1. Create Account");
                System.out.println("2. Login\n");
                System.out.println("Again Enter To Choose:");
                WS_CheckerV = inputHolder.next();
            }
        }while(WS_CheckerV.matches(intPattern)==false);
        WS_Checker = Integer.parseInt(WS_CheckerV);
        if(WS_Checker == 1){
            accountCreation();
        }else if(WS_Checker == 2){
            System.out.println("Enter Mobile Number: ");
            IHMob = inputHolderE.nextInt();
            IHPass= inputHolderE.nextInt();
            if(EU_MobileNumber == IHMob && EU_Pass == IHPass ){
                System.out.println("Your Balance Is: "+ EU_Balance);
                EU_Loopy();

            }else{
                System.out.println("Wrong Credentials, Not Matching With Any Account ");
                checker();
            }
        }else{
            System.out.println("\nChoose B/w 1 and 2\n");
            checker();
        }
    }


    void EU_Loopy(){
        System.out.println("\nA. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App\n");
        System.out.println("Enter (A,B,C,D) To Choose: ");
        S_Checker = inputHolder.next();
        do{
            if(S_Checker.toLowerCase().equals("a")){
                System.out.println("\nEnter Amount To Deposit");
                depositMoneyV = inputHolder.next();
                do{
                    if(!depositMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Deposit");
                        depositMoneyV = inputHolder.next();
                    }
                }while(depositMoneyV.matches(intPattern)==false);
                depositMoney = Double.parseDouble(depositMoneyV);
                deposit(depositMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                EU_Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("b")){
                System.out.println("\nEnter Amount To Widthdraw");
                widthdrawlMoneyV = inputHolder.next();
                do{
                    if(!widthdrawlMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Widthdraw");
                        widthdrawlMoneyV = inputHolder.next();
                    }
                }while(widthdrawlMoneyV.matches(intPattern)==false);
                widthdrawlMoney = Double.parseDouble(widthdrawlMoneyV);
                widthdraw(widthdrawlMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                System.out.println("Widthdrawl Fees Is: "+ fixedFee );
                EU_Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("c")){
                System.out.println("\nEnter Account No: ");
                AccNumberV = inputHolder.next();
                do{
                    if(!AccNumberV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Account Number To Transfer");
                        AccNumberV = inputHolder.next();
                    }
                }while(AccNumberV.matches(intPattern)==false);
                AccNumber = Double.parseDouble(AccNumberV);
                System.out.println("\nEnter Amount To Transfer");
                transferMoneyV = inputHolder.next();
                do{
                    if(!transferMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Transfer");
                        transferMoneyV = inputHolder.next();
                    }
                }while(transferMoneyV.matches(intPattern)==false);
                transferMoney = Double.parseDouble(transferMoneyV);
                transfer(transferMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                EU_Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("d")){
                System.out.println("Thank You For Using Our Bank, The App Is Closed Now!");
                break;
            }
            else{
                System.out.println("\nOther Than A,B,C,D");
                
                checkBalance("\nYour Account Balance Is: ");
                System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App\n");
                System.out.println("Enter (A,B,C,D) To Choose: ");
                
                S_Checker = inputHolder.next();

            }
        }while(S_Checker.toLowerCase() != "a"||S_Checker.toLowerCase() != "b"||S_Checker.toLowerCase() != "c"||S_Checker.toLowerCase() != "d");
    }

    public void EU_deposit(double cashInput){
        EU_Balance = EU_Balance + cashInput;
    }

    public void EU_widthdraw(double cashOut){
        if(EU_Balance>cashOut){
            EU_Balance = EU_Balance - (cashOut + EU_FixedFee);
        }else{
            System.out.println("\nSorry Insufficient Balance!");
        }
    }

    public void EU_transfer(double moneyTransfer){
        if(EU_Balance > moneyTransfer){
            EU_Balance = EU_Balance - moneyTransfer;
        }else{
            System.out.println("Account Hasn't Enough Balance");
        }
    }
    
}

        

class CreateAccount{

    private String firstName;
    private String lastName;
    private String mobileNumber;
    String stringPattern = "^[a-zA-Z]+$";
    String intPattern = "[0-9]+";
    String doublePattern = "^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$";
    // String doublePattern = "[0-9]+(\.){0,1}[0-9]*";
    private String userPswd;
    private double balance = 1000;
    private double fixedFee = 15;
    private String S_Checker;
    private String depositMoneyV;
    private double depositMoney;
    private String widthdrawlMoneyV;
    private double widthdrawlMoney;
    private String transferMoneyV;
    private double transferMoney;
    private String AccNumberV;
    private double AccNumber;


    Scanner inputHolder = new Scanner(System.in);

    // void Validator(String InputField, String InputFieldTester, String msg){
    //     do{
    //         if(!InputField.matches(InputFieldTester)){
    //             System.out.println("\nPlease enter correct data type");
    //             System.out.println("\nEnter "+msg);
    //             InputField = inputHolder.next();
    //         }
    //     }while(InputField.matches(InputFieldTester)==false);
    // }

    void accountCreation(){

        // System.out.println("Enter First Name: ");
        // firstName = inputHolder.next();
        
        // System.out.println("Enter Last Name: ");
        // lastName = inputHolder.next();
        
        
        // System.out.println("Enter Mobile Number (Excluding 0): ");
        // mobileNumber = inputHolder.next();

        // // Long.parseLong(mobileNumber);
        

        // System.out.println("Enter Positve Integer/Digit Password Only (Excluding 0): ");
        // userPswd = inputHolder.next();
        // do{
        //     if(!userPswd.matches(intPattern)){
        //         System.out.println("\nPlease enter correct data type");
        //         System.out.println("\nEnter Number");
        //         userPswd = inputHolder.next();
        //     }
        // }while(userPswd.matches(intPattern)==false);
        // Long.parseLong(userPswd);

        System.out.println("\nCongrats! You're Account Is Created Successfully");

        checkBalance("Your Balance Is: ");
        Loopy();
        
    }

    private void Loopy(){
        System.out.println("\nA. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App\n");
        System.out.println("Enter (A,B,C,D) To Choose: ");
        S_Checker = inputHolder.next();
        do{
            if(S_Checker.toLowerCase().equals("a")){
                System.out.println("\nEnter Amount To Deposit");
                depositMoneyV = inputHolder.next();
                do{
                    if(!depositMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Deposit");
                        depositMoneyV = inputHolder.next();
                    }
                }while(depositMoneyV.matches(intPattern)==false);
                depositMoney = Double.parseDouble(depositMoneyV);
                deposit(depositMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("b")){
                System.out.println("\nEnter Amount To Widthdraw");
                widthdrawlMoneyV = inputHolder.next();
                do{
                    if(!widthdrawlMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Widthdraw");
                        widthdrawlMoneyV = inputHolder.next();
                    }
                }while(widthdrawlMoneyV.matches(intPattern)==false);
                widthdrawlMoney = Double.parseDouble(widthdrawlMoneyV);
                widthdraw(widthdrawlMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                System.out.println("Widthdrawl Fees Is: "+ fixedFee );
                Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("c")){
                System.out.println("\nEnter Account No: ");
                AccNumberV = inputHolder.next();
                do{
                    if(!AccNumberV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Account Number To Transfer");
                        AccNumberV = inputHolder.next();
                    }
                }while(AccNumberV.matches(intPattern)==false);
                AccNumber = Double.parseDouble(AccNumberV);
                System.out.println("\nEnter Amount To Transfer");
                transferMoneyV = inputHolder.next();
                do{
                    if(!transferMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Transfer");
                        transferMoneyV = inputHolder.next();
                    }
                }while(transferMoneyV.matches(intPattern)==false);
                transferMoney = Double.parseDouble(transferMoneyV);
                transfer(transferMoney);
                checkBalance("Your New Balance After Transaction Is: ");
                Loopy();
                break;
            }else if(S_Checker.toLowerCase().equals("d")){
                System.out.println("Thank You For Using Our Bank, The App Is Closed Now!");
                break;
            }
            else{
                System.out.println("\nOther Than A,B,C,D");
                
                checkBalance("\nYour Account Balance Is: ");
                System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App\n");
                System.out.println("Enter (A,B,C,D) To Choose: ");
                
                S_Checker = inputHolder.next();

            }
        }while(S_Checker.toLowerCase() != "a"||S_Checker.toLowerCase() != "b"||S_Checker.toLowerCase() != "c"||S_Checker.toLowerCase() != "d");
    }

    public void checkBalance(String msg){
        System.out.println(msg+ balance);
    }

    public void deposit(double cashInput){
        balance = balance + cashInput;
    }
    
    public void widthdraw(double cashOut){
        if(balance>cashOut){
            balance = balance - (cashOut + fixedFee);
        }else{
            System.out.println("\nAccount Hasn't Enough Balance To Widthdraw");
        }
    }

    public void transfer(double moneyTransfer){
        if(balance > moneyTransfer){
            balance = balance - moneyTransfer;
        }else{
            System.out.println("\nAccount Hasn't Enough Balance To Transfer");
        }
    }
}

