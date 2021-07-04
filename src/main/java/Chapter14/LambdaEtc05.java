package Chapter14;

import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class LambdaEtc05 {
    public static void main(String[] args) {

//     Supplier는 매개변수는 없고 반환 값만을 갖는 함수형 인터페이스
//     Ex. Supplier<T> = () -> TypeValue ;

        Supplier<String> s = () -> "Hello Supplier";
        System.out.println(s.get());

//     Consumer는 매개변수를 받아서 사용하지만 반환값은 없는 함수형 인터페이스
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("Hello Consumer");

//    Funciton은 T를 매개변수로 받아 처리 후 R로 반환 함
        Function<String, Integer> func = str -> str.length();
        System.out.println(func.apply("Hello Function"));
        System.out.println(func.apply("Hello Function").getClass()); // 타입은 Integer
    }

}
