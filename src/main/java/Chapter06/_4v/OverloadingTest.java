package Chapter06._4v;

class MyMath3 {

    int add(int a, int b) {
        System.out.println("int add( int a, int b) - ");
        return a + b;
    }

    //    반환타입이 다르고 매개변수의 타입이 다른 경우 (오버로딩)
    long add(int a, long b) {
        System.out.println("long add(int a, long b) -");
        return a + b;
    }

    //    반환타입이 다르고 매개변수의 순서가 다른 경우 (오버로딩)
    long add(long a, int b) {
        System.out.println("long add (long a, int b) -");
        return a + b;
    }

    //    메서드 이름만 같고 매개변수, 반환타입이 다른 경우
    long add(long a, long b) {
        System.out.println(" long add (long a, long b) - ");
        return a + b;
    }

    // 메소드 이름만 같은 경우
    long add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}


public class OverloadingTest {

    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3,3));
        System.out.println(mm.add(3L, 3));
        System.out.println(mm.add(3,3L));
        System.out.println(mm.add(3L,3L));

        int[]  a = {100, 200};
        System.out.println(mm.add(a));
    }
}
