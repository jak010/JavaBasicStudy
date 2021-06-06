package Chapter06;

/* Summary
* 기본형 매개변수는
*   복사된 값을 넘겨주는 것이므로 원본의 값을 변경 못함
* 참조형 매개변수는
*   값이 저장된 주소를 넘겨주는 것이므로 변경이 가능함 (원본을 넘겨주는 개념)
* */

class Data {
    int x;
}

public class Primitive_n_Reference_ParamEx {

    public static void main(String[] args) {


//      기본형 매개변수
//      - 변수의 값을 읽기만 할 수 있음 (read only)
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x =" + d.x);

        change01(d.x);  // d.x의 값이 아니라 change() 메서드의 매개변수 x의 값이 변경
        System.out.println("After change(d,x)");
        System.out.println("main() :x = " + d.x);

//      참조형 매개변수
//        - 변수의 값을 읽고 변경할 수 있음 (read & write)
//        Data d2 = new Data();
//        d2.x = 1000; // 변경 전의 값을 초기화
//        System.out.println("main(): x = " + d2.x);
//
//        change02(d2);
//        System.out.println("After change(d.x)");
//        System.out.println("main() x  =" + d2.x);

    }

//    기본형 매개변수
    static void change01(int x) {
        x = 99;
        System.out.println("change() : x = " + x);
    }

    //    참조형 매개변수
//    static void change02(Data d) {
//        d.x = 99;
//        System.out.println("change() x = " + d.x);
//    }
}
