package UC1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void userFirstName(String firstName) {

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.find()) {
            System.out.println("Valid -> " + firstName);
        } else {
            System.out.println("Invalid -> " + firstName);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid First Name : ");
        String isValidFirstName = sc.nextLine();
        userFirstName(isValidFirstName);
    }
}