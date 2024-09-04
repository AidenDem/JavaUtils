import java.util.Scanner;

public class InputUtils {
    static Scanner input = new Scanner(System.in);

    public static String writeReadLine(String write) {
        System.out.println(write);
        return input.next();
    }
}