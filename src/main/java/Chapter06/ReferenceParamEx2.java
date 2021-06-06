package Chapter06;

/*
*  배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근함
* */

public class ReferenceParamEx2 {

    public static void main(String[] args) {


        int[] x = {10,}; // 크기가 1인 배열
        System.out.println("main() : x= " + x[0]);

        change(x);

        System.out.println("After Change()");
        System.out.println("main() :x =" + x[0]);

    }

    static void change(int[] x) {
        x[0] = 999;
        System.out.println("change() :x = " + x[0]);
    }

}
