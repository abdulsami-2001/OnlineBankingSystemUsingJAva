import java.util.Scanner;

class OnlineBankingSystem extends CreateAccount{

    int WSChecker;
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
        WSChecker = inputHolderE.nextInt();
    }
    public static void main(String[] args) {
        OnlineBankingSystem obj = new OnlineBankingSystem();
        CreateAccount obj1 = new CreateAccount();
        obj.checker();
    }

    void checker(){
        if(WSChecker == 1){
            accountCreation();
        }else if(WSChecker == 2){
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
    double balance = 150;
    double fixedFee = 0.5;
    int checker;


    Scanner inputHolder = new Scanner(System.in);

    void accountCreation(){
        System.out.println("Enter First Name: ");
        firstName = inputHolder.next();

        do{
            if(!firstName.matches(characterTester)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nEnter First Name: ");
                firstName = inputHolder.next();
            }
        }while(firstName.matches(characterTester)==false);
        
        System.out.println("Enter Last Name: ");
        lastName = inputHolder.next();
        
        do{
            if(!lastName.matches(characterTester)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nEnter Last Name: ");
                lastName = inputHolder.next();
            }
        }while(lastName.matches(characterTester)==false);
            
        System.out.println("Enter Mobile Number (Excluding 0): ");
        mobileNumber = inputHolder.next();

        do{
            if(!mobileNumber.matches(numberTester)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("\nEnter Mobile Number: ");
                mobileNumber = inputHolder.next();
            }
        }while(mobileNumber.matches(numberTester)==false);
        Long.parseLong(mobileNumber);
        
        System.out.println("Enter 4 Digits Password Only (Excluding 0): ");
        userPswd = inputHolder.next();
        do{
            if(!userPswd.matches(numberTester)){
                System.out.println("\nPlease enter correct data type");
                System.out.println("Enter Positve Integer/Digit Password Only (Excluding 0): ");
                userPswd = inputHolder.next();
            }
        }while(userPswd.matches(numberTester)==false);
        Long.parseLong(userPswd);

        System.out.println("\nCongrats! You're Account Is Created Successfully");

        System.out.println("Your Balance Is: "+ balance);

        
        System.out.println("1. Deposit Money\n2. Widthdraw Money\n3. Transfer Money");
        System.out.println("ENter 1");
        checker = inputHolder.nextInt();

        if(checker == 1){
            deposit(5000);
            System.out.println("New Balance is: "+ balance);
        }else if(checker ==2){
            widthdraw(50);
            System.out.println("New Balance is: "+ balance);
        }else if(checker ==3){
            transfer(500);
            System.out.println("Balance Is: "+ balance);
        }else{
            System.out.println("Unexpected Behaviour");
        }
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

