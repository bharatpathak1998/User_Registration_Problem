package UC2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void userLastName(String lastName) {

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.find()) {
            System.out.println("Valid -> " + lastName);
        } else {
            System.out.println("Invalid -> " + lastName);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Last Name : ");
        String isValidLastName = sc.nextLine();
        userLastName(isValidLastName);
    }
}
