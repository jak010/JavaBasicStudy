package Chapter14.SteamExampls;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.*;

public class SteamNote01 {

    public static void main(String[] args) {

        // 01. Collection Stream
        System.out.println("============ 11111111  ==============");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::println);
        // Error. Stream 이미 닫힘
        // intStream.forEach(System.out::println);

        /* =-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-= */

        // 02. Array Stream
        // Ex. 문자열 스트림 생성 예제

        System.out.println("============ 222222  ==============");
        Stream<String> strString01 = Stream.of("a", "b", "c");
        Stream<String> strString02 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strString03 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strString04 = Arrays.stream(new String[]{"a", "b", "c", "d"}, 0, 3);

//        밑의 출력은 주소를 출력함
//        System.out.println(strString01);
//        System.out.println(strString02);
//        System.out.println(strString03);
//        System.out.println(strString04);

        strString01.forEach(System.out::printf);
        System.out.println();
        strString02.forEach(System.out::printf);
        System.out.println();
        strString03.forEach(System.out::printf);
        System.out.println();
        strString04.forEach(System.out::printf);
        System.out.println();

        // 03. 특정 범위의 수
        System.out.println("============ 33333333  =============");
        IntStream intStream01 = IntStream.range(1, 5); // 1부터 4까지
        IntStream intStream02 = IntStream.rangeClosed(1, 5); // 1부터 5까지

        intStream01.forEach(System.out::print);
        System.out.println();
        intStream02.forEach(System.out::print);
        System.out.println();
        System.out.println("===================================");

        // 04. 임의의 수
        IntStream intStreamEx01 = new Random().ints(); // 무한 스트림이래
        intStreamEx01.limit(5).forEach(System.out::println); // 출력은?

        System.out.println("============ 444444 =================");

        IntStream intStreamEx02 = new Random().ints(3); // 유한스트림이라는디?
        intStreamEx02.limit(5).forEach(System.out::println);

        IntStream intStreamEx03 = new Random().ints(1, 3); // 지정된 범위의 스트림만 생성 가능
        intStreamEx03.limit(5).forEach(System.out::println);


        // 05. 람다식
        System.out.println("======= 55555 ====================");
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        evenStream.limit(3).forEach(System.out::println);
        System.out.println("===================================");

        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(3).forEach(System.out::println);
        System.out.println("===================================");

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(3).forEach(System.out::println);

        // 06. 파일 스트림
        System.out.println("========== 66666666  ========");
        try {
            String fileName = "C:\\Users\\Jan\\IdeaProjects\\JavaBasicStudy\\src\\main\\java\\Chapter14\\SteamExampls\\StreamFile.txt";
            Stream<String> stream = Files.lines(Paths.get(fileName));
            stream.forEach(System.out::println);
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 07. 빈 스트림
        System.out.println("========== 777777777  ========");
        Stream emptyStream = Stream.empty();
        long count = emptyStream.count();
        System.out.println(count);

        // 08. 두 스트림 연결
        System.out.println("========== 88888888  ========");
        String[] str1 = {"123", "456", "789"};
        String[] str2 = {"abc", "efg", "hij"};

        Stream<String> strs01 = Stream.of(str1);
        Stream<String> strs02 = Stream.of(str2);
        Stream<String> strs03 = Stream.concat(strs01, strs02);
        strs03.forEach(System.out::println);
    }
}
