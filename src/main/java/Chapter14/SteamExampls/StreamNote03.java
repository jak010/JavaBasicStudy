package Chapter14.SteamExampls;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNote03 {
    public static void main(String[] args) {

        // Stream를 이용한 로또 번호 생성
        IntStream intStream = new Random().ints(1,46);

        // mapToObj를 걸기 전까지는 타입 에러 발생
        Stream<String> lottoStream = intStream.distinct().limit(6).sorted().mapToObj(i->i+", ");

        lottoStream.forEach(System.out::println);


    }
}
