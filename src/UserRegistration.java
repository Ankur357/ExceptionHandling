import java.util.Scanner;

class InvalidCountryException extends Exception{
    InvalidCountryException(String s){
        super(s);
    }
}

public class UserRegistration {
    public void registerUser(String userName, String userCountry) throws InvalidCountryException{
        if(userCountry.equals("India")) {
            System.out.println("User Registration done successfully");
        }
        else{
            throw new InvalidCountryException("User Outside india cannot be registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();
        System.out.println("Enter your username and country name");
        String username = sc.nextLine();
        String usercountry = sc.nextLine();
        System.out.println(username + " " + usercountry);
        try {
            obj.registerUser(username,usercountry);
        }
        catch (InvalidCountryException e){
            System.out.println(e);
        }
    }
}