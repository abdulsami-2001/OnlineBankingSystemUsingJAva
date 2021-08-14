import java.util.Scanner;

class OnlineBankingSystem extends CreateAccount{

    private String WS_CheckerV;
    private double WS_Checker;
    private String EUFirstName = "HUMS";
    private String EULastName = "NO_HUMS";
    private int EU_MobileNumber = 8881212;
    private int EU_Pass = 123456;
    private double EU_Balance = 5000;
    private double EU_FixedFee = 15;
    private String IHMobV;
    private String IHPassV;
    private int IHMob;
    private int IHPass;
    private String EU_Checker;

    private String EU_depositMoneyV;
    private double EU_depositMoney;
    private String EU_widthdrawlMoneyV;
    private double EU_widthdrawlMoney;
    private String EU_transferMoneyV;
    private double EU_transferMoney;
    private String EU_AccNumberV;
    private double EU_AccNumber;


    OnlineBankingSystem(){
        System.out.println("\nWelcome To Loopy Bank\n");
    }
    
    public static void main(String[] args) {
        OnlineBankingSystem obj = new OnlineBankingSystem();
        // CreateAccount obj1 = new CreateAccount();
        obj.checker();
    }

    void checker(){
        System.out.println("1. Create Account");
        System.out.println("2. Login\n");
        System.out.println("Enter Number To Choose: ");
        WS_CheckerV = inputHolder.next();
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
            IHMobV = inputHolder.next();
            do{
                if(!IHMobV.matches(intPattern)){
                    System.out.println("\nPlease Enter Correct Data Type Input");
                    System.out.println("\nAgain Enter Mobile Number:");
                    IHMobV = inputHolder.next();
                }
            }while(IHMobV.matches(intPattern)==false);
            IHMob = Integer.parseInt(IHMobV);

            System.out.println("Enter Positive Integer/Digit Password: ");
            IHPassV = inputHolder.next();
            do{
                if(!IHPassV.matches(intPattern)){
                    System.out.println("\nPlease Enter Correct Data Type Input");
                    System.out.println("\nAgain Enter Positive Integer/Digit Password: ");
                    IHPassV = inputHolder.next();
                }
            }while(IHPassV.matches(intPattern)==false);
            IHPass = Integer.parseInt(IHPassV);

            if(EU_MobileNumber == IHMob && EU_Pass == IHPass ){
                System.out.println("\nHey, "+EUFirstName + " " + EULastName);
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
        EU_Checker = inputHolder.next();
        do{
            if(EU_Checker.toLowerCase().equals("a")){
                System.out.println("\nEnter Amount To Deposit");
                EU_depositMoneyV = inputHolder.next();
                do{
                    if(!EU_depositMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Deposit");
                        EU_depositMoneyV = inputHolder.next();
                    }
                }while(EU_depositMoneyV.matches(intPattern)==false);
                EU_depositMoney = Double.parseDouble(EU_depositMoneyV);
                EU_deposit(EU_depositMoney);
                EU_checkBalance("Your New Balance After Transaction Is: ");
                EU_Loopy();
                break;
            }else if(EU_Checker.toLowerCase().equals("b")){
                System.out.println("\nEnter Amount To Widthdraw");
                EU_widthdrawlMoneyV = inputHolder.next();
                do{
                    if(!EU_widthdrawlMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Widthdraw");
                        EU_widthdrawlMoneyV = inputHolder.next();
                    }
                }while(EU_widthdrawlMoneyV.matches(intPattern)==false);
                EU_widthdrawlMoney = Double.parseDouble(EU_widthdrawlMoneyV);
                EU_widthdraw(EU_widthdrawlMoney);
                EU_checkBalance("Your New Balance After Transaction Is: ");
                System.out.println("Widthdrawl Fees Is: "+ EU_FixedFee );
                EU_Loopy();
                break;
            }else if(EU_Checker.toLowerCase().equals("c")){
                System.out.println("\nEnter Account No: ");
                EU_AccNumberV = inputHolder.next();
                do{
                    if(!EU_AccNumberV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Account Number To Transfer");
                        EU_AccNumberV = inputHolder.next();
                    }
                }while(EU_AccNumberV.matches(intPattern)==false);
                EU_AccNumber = Double.parseDouble(EU_AccNumberV);
                System.out.println("\nEnter Amount To Transfer");
                EU_transferMoneyV = inputHolder.next();
                do{
                    if(!EU_transferMoneyV.matches(intPattern)){
                        System.out.println("\nPlease Enter Correct Data Type Input");
                        System.out.println("\nAgain Enter Amount To Transfer");
                        EU_transferMoneyV = inputHolder.next();
                    }
                }while(EU_transferMoneyV.matches(intPattern)==false);
                EU_transferMoney = Double.parseDouble(EU_transferMoneyV);
                EU_transfer(EU_transferMoney);
                EU_checkBalance("Your New Balance After Transaction Is: ");
                EU_Loopy();
                break;
            }else if(EU_Checker.toLowerCase().equals("d")){
                System.out.println("Thank You For Using Our Bank, The App Is Closed Now!\n");
                break;
            }
            else{
                System.out.println("\nOther Than A,B,C,D");
                
                EU_checkBalance("\nYour Account Balance Is: ");
                System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App\n");
                System.out.println("Enter (A,B,C,D) To Choose: ");
                
                EU_Checker = inputHolder.next();

            }
        }while(EU_Checker.toLowerCase() != "a"||EU_Checker.toLowerCase() != "b"||EU_Checker.toLowerCase() != "c"||EU_Checker.toLowerCase() != "d");
    }

    public void EU_checkBalance(String msg){
        System.out.println(msg+ EU_Balance);
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

    String stringPattern = "^[a-zA-Z]+$";
    String intPattern = "[0-9]+";
    String doublePattern = "^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$";
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String userPswd;
    private double balance = 0;
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


    void accountCreation(){

        System.out.println("Enter First Name: ");
        firstName = inputHolder.next();
        do{
            if(!firstName.matches(stringPattern)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nAgain Enter First Name: ");
                firstName = inputHolder.next();
            }
        }while(firstName.matches(stringPattern)==false);
        System.out.println("Enter Last Name: ");
        lastName = inputHolder.next();
        do{
            if(!lastName.matches(stringPattern)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nAgain Enter Last Name: ");
                lastName = inputHolder.next();
            }
        }while(lastName.matches(stringPattern)==false);
        
        System.out.println("Enter Mobile Number (Excluding 0): ");
        mobileNumber = inputHolder.next();
        do{
            if(!mobileNumber.matches(intPattern)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nAgain Enter Mobile Number: ");
                mobileNumber = inputHolder.next();
            }
        }while(mobileNumber.matches(intPattern)==false);
        
    
        System.out.println("Enter Positve Integer/Digit Password Only (Excluding 0): ");
        userPswd = inputHolder.next();
        do{
            if(!userPswd.matches(intPattern)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nEnter Positve Integer/Digit Password Only (Excluding 0): ");
                userPswd = inputHolder.next();
            }
        }while(userPswd.matches(intPattern)==false);
    
        System.out.println("\nCongrats! You're Account Is Created Successfully");
        System.out.println("\nHey, "+firstName + " " + lastName);
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









    // void Validator(String InputField, String InputFieldTester, String msg){
    //     do{
    //         if(!InputField.matches(InputFieldTester)){
    //             System.out.println("\nPlease enter correct data type");
    //             System.out.println("\nEnter "+msg);
    //             InputField = inputHolder.next();
    //         }
    //     }while(InputField.matches(InputFieldTester)==false);
    // }