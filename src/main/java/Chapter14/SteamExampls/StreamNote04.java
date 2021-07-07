package Chapter14.SteamExampls;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamNote04 {
    public static void main(String[] args) {

        // 배열을 요소로 갖는 스트림
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"aaa", "bbb", "ccc"},
                new String[]{"123", "456", "789"}
        );

        // print
        // strArrStream.forEach(System.out::println);

        // Bad Case
//        Stream<Stream<String>> strStream = strArrStream.map(Arrays::stream);
        // 아래의 출력은 주소를 출력
//        strStream.forEach(System.out::println);


        // flatMap
//        Stream<String> strStream02 = strArrStream.flatMap(Arrays::stream);
//        strStream02.forEach(System.out::println);

    }
}
