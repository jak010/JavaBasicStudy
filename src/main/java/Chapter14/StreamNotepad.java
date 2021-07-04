package Chapter14;

import java.util.*;
import java.util.stream.Stream;

public class StreamNotepad {

    public static void main(String[] args) {

        String[] strArr = {"aaa", "ddd", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);


    }

}
