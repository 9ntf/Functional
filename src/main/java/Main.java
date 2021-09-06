import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //исходный текст
        String strangeText = "tu ga trr kllek ekd lkj we dewlje wd ewfvfpw envpo  aooa oo aoa oaoo wefvjn wepv jner fknwer vklwe jn fkwern f iwierfn w erf";
        //Насколько понял это чистая функция с использованием монады
        List<String> dictionary = Arrays.stream(strangeText.split(" ")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //Недетриминированная функция
        dictionary.forEach(System.out::println);
    }
}
