package Chapter14.SteamExampls;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {

        File[] fileArr = {
                new File("./StreamFile.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        // filter -> 주어진 조건에 맞지 않는 요소 걸러내기
        // map  -> 원하는 필드만 뽑아내기
        // peek -> 스트림 중간중간 결과 확인하기
        fileStream.map(File::getName)
                .peek(s->System.out.println("1: " + s))
                .filter(s -> s.indexOf('.') != -1)
                .peek(s->System.out.println("2: " + s))
                .map(s -> s.substring(s.indexOf('.') + 1))
                .peek(s->System.out.println("3: " + s))
                .map(String::toUpperCase)
                .peek(s->System.out.println("4: " + s))
                .distinct() // 중복제거
                .peek(s->System.out.println("5: " + s))
                .forEach(System.out::println);
        System.out.println();
    }
}
