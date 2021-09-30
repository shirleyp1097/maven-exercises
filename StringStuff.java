import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("Input is non-numeric");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println(StringUtils.reverse(userInput));
        } else {
            System.out.println("Input is numeric");
        }

    }
}
