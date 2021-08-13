import java.util.Scanner;


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

class CreateAccount{

    String firstName;
    String lastName;
    String mobileNumber;
    String characterTester = "^[a-zA-Z]+$";
    String numberTester = "[0-9]+";

    Scanner inputHolder = new Scanner(System.in);

    CreateAccount(){
        System.out.println("Enter First Name: ");
        firstName = inputHolder.next();

        do{
            if(!firstName.matches(characterTester)){
                System.out.println("Please enter correct data type");
                System.out.println("Enter First Name: ");
                firstName = inputHolder.next();
            }
        }while(firstName.matches(characterTester)==false);
        
        System.out.println("Enter Last Name: ");
        lastName = inputHolder.next();
        
        do{
            if(!lastName.matches(characterTester)){
                System.out.println("Please enter correct data type");
                System.out.println("Enter Last Name: ");
                lastName = inputHolder.next();
            }
        }while(lastName.matches(characterTester)==false);
            
        System.out.println("Enter Mobile Number (Excluding 0): ");
        mobileNumber = inputHolder.next();

        do{
            if(!mobileNumber.matches(numberTester)){
                System.out.println("Please enter correct data type");
                System.out.println("Enter Mobile Number: ");
                mobileNumber = inputHolder.next();
            }
        }while(mobileNumber.matches(numberTester)==false);
        Long.parseLong(mobileNumber);
        System.out.println("\nCongrats! You're Account Is Created Successfully");
    }
}