import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise03 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        float x = getIntFromString("x");
        float y = getIntFromString("y");

        System.out.println("result is: " + (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.tan(x * y)))));

    }

    private static float getIntFromString(String description) {
        float a = 0.0F;

        try {
            System.out.format("type %s count: ", description);
            a = Float.parseFloat(reader.readLine());

        } catch (NumberFormatException | IOException e) {
            System.out.println("you are wrong. Try again...");
            getIntFromString(description);
        }
        return a;

    }
}
