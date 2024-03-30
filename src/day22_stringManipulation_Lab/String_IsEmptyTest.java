package day22_stringManipulation_Lab;

public class String_IsEmptyTest {

    public static void main(String[] args) {

        String username = "";
        String password = "";


        if(username.isEmpty()){
            System.out.println("Username cant be empty");
        }else
            System.out.println("Username is not empty");


        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Username or password is empty");
        }else {
            System.out.println("Username or password is empty");
        }


    }

}
