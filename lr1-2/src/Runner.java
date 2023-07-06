import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    *create 21.02.2018
 */
public class Runner {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        int count = 0;
        String word = "1wr18wrh48f1r41f15w7hf1h118f1rw1w15df15wh187w84f1w1";
        Matcher matcher = pattern.matcher(word);
        int start = 0;
        while (matcher.find(start)) {
            String value = word.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            System.out.print(result);
            start = matcher.end();
            count = ++count;
        }
        System.out.println();
        System.out.println("Общее число ="+count);

    }
}

