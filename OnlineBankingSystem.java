import java.util.Scanner;

class OnlineBankingSystem extends CreateAccount{

    int WS_Checker;
    String EUFirstName = "HUMS";
    String lastName = "NO_HUMS";
    int EU_MobileNumber = 555;
    int EU_Pass = 999;
    double EU_Balance = 5000;
    double EU_FixedFee = 0.5;
    int IHMob;
    int IHPass;
    int EU_Checker;

    Scanner inputHolderE = new Scanner(System.in);

    OnlineBankingSystem(){
        System.out.println("\nWelcome To Our Bank\n\n");
        System.out.println("1. Create Account");
        System.out.println("2. Login\n\n");
        System.out.println("\nEnter Number To Choose: ");
        WS_Checker = inputHolderE.nextInt();
    }
    public static void main(String[] args) {
        OnlineBankingSystem obj = new OnlineBankingSystem();
        CreateAccount obj1 = new CreateAccount();
        obj.checker();
    }

    void checker(){
        if(WS_Checker == 1){
            accountCreation();
        }else if(WS_Checker == 2){
            System.out.println("Enter Mobile Number: ");
            IHMob = inputHolderE.nextInt();
            IHPass= inputHolderE.nextInt();
            if(EU_MobileNumber == IHMob && EU_Pass == IHPass ){
                System.out.println("Your Balance Is: "+ EU_Balance);
                System.out.println("1. Deposit Money\n2. Widthdraw Money\n3. Transfer Money");
                EU_Checker = inputHolder.nextInt();
                
                if(EU_Checker == 1){
                    EU_deposit(5000);
                    System.out.println("New Balance is: "+ EU_Balance);
                }else if(EU_Checker ==2){
                    EU_widthdraw(50);
                    System.out.println("New Balance is: "+ EU_Balance);
                }else if(EU_Checker ==3){
                    EU_transfer(500);
                    System.out.println("Balance Is: "+ EU_Balance);
                }else{
                    System.out.println("Unexpected Behaviour");
                }

            }else{
                System.out.println("MAooo");
                System.out.println(IHMob);
            }
        }else{
            System.out.println("Checker 3 ya else");
        }
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

    String firstName;
    String lastName;
    String mobileNumber;
    String characterTester = "^[a-zA-Z]+$";
    String numberTester = "[0-9]+";
    String userPswd;
    double balance = 1000;
    double fixedFee = 0.5;
    String S_Checker;
    String depositMoneyV;
    double depositMoney;
    String widthdrawlMoneyV;
    double widthdrawlMoney;
    String transferMoneyV;
    double transferMoney;

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
        //     if(!userPswd.matches(numberTester)){
        //         System.out.println("\nPlease enter correct data type");
        //         System.out.println("\nEnter Number");
        //         userPswd = inputHolder.next();
        //     }
        // }while(userPswd.matches(numberTester)==false);
        // Long.parseLong(userPswd);

        System.out.println("\nCongrats! You're Account Is Created Successfully");

        checkBalance("Your Balance Is: ");

        System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App");
        S_Checker = inputHolder.next();

        do{

            if(S_Checker.equals("A") || S_Checker.equals("a")){
                depositMoneyV = inputHolder.next();
                do{
                    if(!depositMoneyV.matches(numberTester)){
                        System.out.println("\nPlease enter correct data type");
                        System.out.println("\nEnter Number");
                        depositMoneyV = inputHolder.next();
                    }
                }while(depositMoneyV.matches(numberTester)==false);
                depositMoney = Double.parseDouble(depositMoneyV);
                deposit(depositMoney);
                checkBalance("Your New Balance Is: ");
                break;
            }else if(S_Checker.equals("B") || S_Checker.equals("b")){
                widthdrawlMoneyV = inputHolder.next();
                do{
                    if(!widthdrawlMoneyV.matches(numberTester)){
                        System.out.println("\nPlease enter correct data type");
                        System.out.println("\nEnter Number");
                        widthdrawlMoneyV = inputHolder.next();
                    }
                }while(widthdrawlMoneyV.matches(numberTester)==false);
                widthdrawlMoney = Double.parseDouble(widthdrawlMoneyV);
                widthdraw(widthdrawlMoney);
                checkBalance("Your New Balance Is: ");
                break;
            }else if(S_Checker.equals("C") || S_Checker.equals("c")){
                transferMoneyV = inputHolder.next();
                do{
                    if(!transferMoneyV.matches(numberTester)){
                        System.out.println("\nPlease enter correct data type");
                        System.out.println("\nEnter Number");
                        transferMoneyV = inputHolder.next();
                    }
                }while(transferMoneyV.matches(numberTester)==false);
                transferMoney = Double.parseDouble(transferMoneyV);
                transfer(transferMoney);
                checkBalance("Your New Balance Is: ");
                break;
            }else if(S_Checker.equals("D") || S_Checker.equals("d")){
                System.out.println("Thank You");
                break;
            }
            else{
                System.out.println("Other Than A,B,C,D");
                
                System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money\nD. Close App");
                S_Checker = inputHolder.next();

            }
        }while(S_Checker != "A" ||S_Checker != "a"||S_Checker!= "B"||S_Checker != "b"||S_Checker != "C"||S_Checker != "c"||S_Checker != "D"||S_Checker != "d");
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
            System.out.println("\nSorry Insufficient Balance!");
        }
    }

    public void transfer(double moneyTransfer){
        if(balance > moneyTransfer){
            balance = balance - moneyTransfer;
        }else{
            System.out.println("Account Hasn't Enough Balance");
        }
    }
}

