package invalidcountryexception;

import java.util.Scanner;

class InvalidCountryException extends Exception {

    public InvalidCountryException(String problem) {
        super(problem);
    }
}

public class UserRegistration {

    public void registerUser_logic(String username, String userCountry)
            throws InvalidCountryException {
        
        String location, names;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your name : \n");
        names = obj.nextLine();
        
        System.out.println("Enter your location : \n");
        location = obj.nextLine();
        userCountry = "uganda";
        try {

            if (location.equals(userCountry)) {

                System.out.println("User registration done successfully\n");
            } else {
                throw new InvalidCountryException("Your location is wrong\n");
            }

        } catch (InvalidCountryException e) {
            System.out.println(" User Outside Uganda cannot be registered \n");
        }

    }

    public static void main(String args[]) throws InvalidCountryException {
        UserRegistration output = new UserRegistration();
        output.registerUser_logic("Mickey", "US");
    }
}
