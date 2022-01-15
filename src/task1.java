import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = getIntFromString("1st");
        int b = getIntFromString("2nd");
        int c = getIntFromString("3rd");
        System.out.println("result is: " + (((a - 3) * b / 2) + c));

    }

    private static int getIntFromString(String description) {
        int a = 0;

        try {
            System.out.format("type %s count: ", description);
            a = Integer.parseInt(reader.readLine());

        } catch (NumberFormatException | IOException e) {
            System.out.println("you are wrong. Try again...");
            getIntFromString(description);
        }
        return a;

    }
}
