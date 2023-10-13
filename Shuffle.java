import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Collections.shuffle(numbers);

       
        System.out.println(numbers);
    }
}
