package Chapter14.SteamExampls;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamNote02 {
    public static void main(String[] args) {

        // 정렬, sorted

        // 기본 정렬
        Stream<String> strStream = Stream.of("e","d","c","b","a");
        strStream.sorted().forEach(System.out::print);
        strStream.close();

        System.out.println("\n=============================");

        // 기본 정렬의 역순
        Stream<String> strStream02 = Stream.of("a","b","c","d","e");
        strStream02.sorted(Comparator.reverseOrder()).forEach(System.out::print);
        strStream02.close();

    }
}
