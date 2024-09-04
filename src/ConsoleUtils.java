import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleUtils {
    static Scanner input = new Scanner(System.in);

    public static void writeLine(Object write) {
        System.out.println(write);
    }

    public static String readLine() {
        return input.next();
    }

    public static char readKey() {
        try {
            return (char) System.in.read();
        } catch (Exception e) {
            return ' ';
        }
    }

    public static String writeReadLine(String write) {
        System.out.println(write);
        return input.next();
    }
}
