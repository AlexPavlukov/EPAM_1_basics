import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise02 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        float a = getIntFromString("1st");
        float b = getIntFromString("2nd");
        float c = getIntFromString("3rd");

        System.out.println("result is: " + (((b + (Math.sqrt((b * b) + (4 * a * c)))) / (2 * a)) - ((Math.pow(a, 3) * c) + Math.pow(b, -2))));

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
