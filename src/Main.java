import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "1, 2, 3;4";
        String delimiter = ",";

        if (!input.contains(delimiter)) {
            System.out.println("구분자가 없습니다.");
            return;
        }

        try {
            String[] result = input.split(delimiter);
        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("구분자가 잘못되었습니다.");
        }
    }
}