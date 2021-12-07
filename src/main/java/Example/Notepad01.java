package Example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}

public class Notepad01 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        /* Stream을 이해하기 */
        Stream<String> stream = list.stream();
        stream.forEach(bbb -> System.out.println("값: " + bbb));

        /* Stream을 사용해보기 */
        String[] array = {"a", "B", "c", "D", "e"};
        Stream<String> strStream = Arrays.stream(array);
        strStream.forEach(a -> System.out.println(a + ","));


        /* class와 함꼐 stream 사용해보기*/
        List<Student> stu = Arrays.asList(
            new Student("GodJian", 1),
            new Student("JangJang", 2),
            new Student("IamLegend", 3)
        );

        Stream<Student> stream2 = stu.stream();
        stream2.forEach(s -> System.out.println("이름: " + s.getName()));

        /* 범위를 생성하는 Stream */

        IntStream intStream = IntStream.range(1, 4);
        intStream.forEach(System.out::print);

        System.out.println();

        IntStream intStream2 = IntStream.rangeClosed(1, 4);
        intStream2.forEach(System.out::print);

        System.out.println();
        System.out.println("==============");

        /* Stream filtering */
        IntStream insStream3 = IntStream.of(1, 2, 3, 4, 5, 6, 8, 9);
        insStream3.distinct().forEach(e -> System.out.print(e));

        IntStream insStream4 = IntStream.range(1, 10);
        insStream4.filter(n -> n % 2 != 0).forEach(e -> System.out.println(e));

        Stream<String> stringSream = Stream.of("HTML", "CSS", "JAVA");
//        stringSream.map(n -> n.length() > 3).forEach(e -> System.out.println(e));
        System.out.println("\n");
        stringSream.filter(n -> n.length() > 3).forEach(s -> System.out.println(s));


    }
}
