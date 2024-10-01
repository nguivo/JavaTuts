import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T015RegEx {

    public static void main(String[] args) {
        // find out there are any occurrences of the word 'proud' in a sentence
        Pattern pattern = Pattern.compile("proud", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Proud and true son of the soil");
        boolean result = matcher.find();

        if(result) {
            System.out.println("Match found!");
        }
        else {
            System.out.println("No match found");
        }
    }
}
