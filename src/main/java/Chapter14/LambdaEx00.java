package Chapter14;

@FunctionalInterface
interface MyFunction {

    int max(int a, int b);
}


public class LambdaEx00 {

    public static void main(String[] args) {

//      람다 사용법
//      자바의 람다는 익명 함수가 아니라 익명 객체!

//      CASE 01:  값을 더하는 경우
        MyFunction f = (int a, int b) -> a + b;

//      CASE 02: 식을 사용하는 경우
        MyFunction f2 = (int a, int b) -> {
            return a > b ? a : b;
        };

//      CASE 03: 타입 추론이 가능하다면 타입을 명시할 필요가 없음
        MyFunction f3 = (a, b) -> a * b;

        System.out.println(f.max(1, 2));
        System.out.println(f2.max(5, 4));
        System.out.println(f3.max(2, 2));

    }
}
