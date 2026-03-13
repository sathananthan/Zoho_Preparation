import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyJava8StreamsModernApproch {
    public static void main(String[] args) {
        String str = "hello";

        Map<Character, Long> freq =
                str.chars()
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println(freq);
    }
}