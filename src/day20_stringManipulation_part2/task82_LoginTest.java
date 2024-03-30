package day20_stringManipulation_part2;
import java.util.Scanner;
public class task82_LoginTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String usernama = scan.nextLine();

        System.out.println("Enter your password");
        String password = scan.nextLine();

        String userNameInSystem = "Mike";
        String passwordInSystem = "123";

        if(usernama.equals("") && password.equals("")){
            System.out.println("Password amd username cant be empty");
        }else if(usernama.equals("") && !password.equals("")) {
            System.out.println("Username cant be empty");
        }else if(!usernama.equals("") && password.equals("")){
            System.out.println("Password cant be empty");
        } else if(usernama.equals(userNameInSystem) && password.equals(passwordInSystem)) {
            System.out.println("User logged in successfully");
        }


    }

}


