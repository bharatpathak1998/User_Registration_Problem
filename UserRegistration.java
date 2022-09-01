package UC4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void userMobileFormat(String phoneNumber) {

        Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.find()) {
            System.out.println("Valid -> " + phoneNumber);
        } else {
            System.out.println("Invalid -> " + phoneNumber);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Phone Number : ");
        String isValidPhoneNumber = sc.nextLine();
        userMobileFormat(isValidPhoneNumber);
    }
}
