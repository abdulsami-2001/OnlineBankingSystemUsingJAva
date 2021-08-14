import java.util.Scanner;


public class Go {
    double balance = 0;
    double fixedFee = 0.5;
    String S_Checker = "";
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Go obj = new Go();
        obj.accountCreation();
    }

    void accountCreation(){
    
        System.out.println("A. Deposit Money\nB. Widthdraw Money\nC. Transfer Money");
        S_Checker = sc.nextLine();
        // System.out.println("Value OF S_CHECKER "+S_Checker);

        // if(S_Checker == "c"){
        //     System.out.println("not equal c");
        // }
        
        if(S_Checker.equals("a")){
            deposit(5000);
            checkBalance("Your New Balance Is: ");
        }else if(S_Checker.equals("b")){
            widthdraw(50);
            checkBalance("Your New Balance Is: ");
        }else if(S_Checker.equals("c")){
            transfer(500);
            checkBalance("Your New Balance Is: ");
        }else{
            System.out.println("Unexpected Behaviour");
        }
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

// SAhi code from below

    private String firstName;
    private String lastName;
    private String mobileNumber;
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


    // String doublePattern = "[0-9]+(\.){0,1}[0-9]*";



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
