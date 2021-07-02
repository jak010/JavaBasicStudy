package Chapter14;


@FunctionalInterface
interface MyLambda01 {
    void run();
}

public class LambdaEx1 {

    static void execute(MyLambda01 var) {
        var.run();
    }

    static MyLambda01 getMyLambda() {
        MyLambda01 ml = () -> System.out.println("case03.run()");
        return ml;
    }

    public static void main(String[] args) {

//        람다 호출
        MyLambda01 ml = () -> System.out.println("Hello Java");

//        익명 클래스 선언
        MyLambda01 m2 = new MyLambda01() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };


//      익명 객체와 메서드 선언
        MyLambda01 m3 = getMyLambda();

        ml.run();
        m2.run();
        m3.run();

        // 매개변수를 넣을 때는 익명 객체의 타입을 넣어줘야함
        execute(ml);

        // 매개변수로 람다를 넣을 수 있음 !
        execute(() -> System.out.println("Hello();"));

    }

}
