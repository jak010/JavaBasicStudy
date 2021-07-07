package Chapter14;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {

        // 이 함수는 String을 받아서 Integer로 결과를 바꿈
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);

        // 이 함수는 Integer를 받아서 String으로 결과를 바꿈
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

        // g(f(x))
        Function<String, String> h = f.andThen(g);
        // f(g(x))
        Function<Integer, Integer> h2 = f.compose(g);

        System.out.println(h.apply("FF"));
        System.out.println(h.apply("FF").getClass());
        System.out.println(h2.apply(2));
        System.out.println(h2.apply(2).getClass());


        Function<String, String> f2 = x -> x;
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i > 100;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(p.or(q));
        System.out.println(all.test(150));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);

    }
}
