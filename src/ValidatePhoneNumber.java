import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    private static final String REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public static void main(String[] args) {

        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(84)-(a978489648)";

        System.out.println(phoneNumber1.matches(REGEX));
        System.out.println(phoneNumber2.matches(REGEX));


    }

}
