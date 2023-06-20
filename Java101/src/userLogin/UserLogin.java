package userLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username="patika", password, truePassword="12345678", reset, newPassword, message;

        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (username.equals("patika") && truePassword.equals(password)) System.out.println("Login successful!");
        else {
            System.out.print("Your information is incorrect!\n" + "Would you like to reset your password?(Yes/No): ");
            reset = input.nextLine();
            if( reset.equals("Yes") || reset.equals("yes") || reset.equals("YES")) {
                System.out.print("Enter new password: ");
                newPassword = input.nextLine();
                message = (newPassword.equals(truePassword)) ? "Your new password cannot be the same as your old password" : "Password created!";
                System.out.println(message);
            }
            else{
                System.out.println("Process finished!");
            }
        }
    }
}