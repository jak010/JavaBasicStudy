package Chapter14;

import java.util.function.Predicate;

public class Notepad810page {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i > 100;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

    }
}
