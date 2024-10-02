import java.util.ArrayList;
import java.util.function.Consumer;

public class T018LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(29);
        scores.add(3);
        scores.add(87);
        scores.add(43);

        scores.forEach((n) -> {System.out.println(n);});

        // using Java's consumer interface to store a lambda expression in a variable
        Consumer<Integer> method = (n) -> {System.out.println();};
        scores.forEach(method);
    }
}
