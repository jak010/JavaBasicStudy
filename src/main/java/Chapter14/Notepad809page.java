package Chapter14;

import java.util.Arrays;
import java.util.function.Function;

public class Notepad809page {
    public static void main(String[] args) {

//  함수의 합성: andThen
//        (f: String) -> Int
//        (g: Int) -> String

        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
        Function<String, String> h = f.andThen(g);

        System.out.println(h.apply("FF"));
        System.out.println(h.apply("FF").getClass());

//  함수의 합성: compose
//        (x:Integer) -> String
//        (y:String) -> Int
        Function<Integer, String> x = (i) -> Integer.toBinaryString(i);
        Function<String, Integer> y = (s) -> Integer.parseInt(s, 16);
        Function<Integer, Integer> z = y.compose(x);

        System.out.println(z.apply(2));
        System.out.println(z.apply(2).getClass());


    }
}
