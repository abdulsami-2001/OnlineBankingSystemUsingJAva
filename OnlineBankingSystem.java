import java.util.Scanner;

import javax.xml.crypto.Data;


class OnlineBankingSystem{
    public static void main(String[] args) {

        WelcomeScreen obj = new WelcomeScreen();
        CreateAccount obj1 = new CreateAccount();
    }
}

class WelcomeScreen{
    WelcomeScreen(){
        System.out.println("\nWelcome To Our Bank\n\n");
        System.out.println("1. Create Account");
        System.out.println("2. Login\n\n");
    }
}

class CreateAccount extends DataBase{

    String firstName;
    String lastName;
    String mobileNumber;
    String characterTester = "^[a-zA-Z]+$";
    String numberTester = "[0-9]+";
    String userPswd;


    Scanner inputHolder = new Scanner(System.in);

    CreateAccount(){
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
    }
}


class DataBase{

    String firstName;
    String lastName;
    String mobileNumber;
    String characterTester = "^[a-zA-Z]+$";
    String numberTester = "[0-9]+";
    String userPswd;

    DataBase(String fn,String ln, String mn, String ct, String nt, String up){
        firstName = fn;
        lastName = ln;
        mobileNumber = mn;
        characterTester = ct;
        numberTester = nt;
        userPswd = up;
    }
    

}