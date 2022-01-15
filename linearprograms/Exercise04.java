public class Exercise04 {
    public static void main(String[] args) {
        double x = 987.654;
        System.out.println(((x * 1000) % 1000) + ((int) x / 1000.0));
    }
}
