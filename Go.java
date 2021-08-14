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
