package Chapter06._3v10;

class MyMath2 {
    // 클래스 메서드
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능.
    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    long a, b;
    // 인스턴스 메서드
    // 인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없음
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }


}

public class MyMathTest2 {

    public static void main(String[] args) {

        // 클래스 메서드 호출 , 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L, 200L));

        // 인스턴스 메서드 호출, 인스턴스 생성 후 호출 가능
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100;
        System.out.println(mm.add());

    }
}
