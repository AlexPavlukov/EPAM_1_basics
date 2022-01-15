import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x = getIntFromString("x");
        int y = getIntFromString("y");

        System.out.println("result is: " + (x <= 4 && x >= -4 && y <= 0 && y >= -3 || x <= 2 && x >= -2 && y >= 0 && y <= 4));

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
