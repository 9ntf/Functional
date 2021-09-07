import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //исходный текст
        String strangeText = "tu ga trr kllek aa bb gtr ewfd hierf hjlkegtr jlke grfi huoe gtr bievrf bjk ewgr bhjkewgr bhjkewgr kj bhevbrf  bjkh ew bjkh ewgrkjhb  ewrf bhjkew rfkj bh ewrfk jbhewrf k jbh f f f f f f f f f f f f f fcc tu ga trr";
        //Насколько понял это чистая функция с использованием монады
        List<String> dictionary = Arrays.stream(strangeText.split(" "))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        //Недетриминированная функция
        dictionary.forEach(System.out::println);
    }
}
