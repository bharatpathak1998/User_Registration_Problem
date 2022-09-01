package UC5_RULE1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void userPassword(String password) {

        Pattern pattern = Pattern.compile("[a-z]{8,20}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            System.out.println("Valid -> " + password);
        } else {
            System.out.println("Invalid -> " + password);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Password : ");
        String isValidPassword = sc.nextLine();
        userPassword(isValidPassword);
    }
}
