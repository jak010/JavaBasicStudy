package Chapter14;

@FunctionalInterface
interface MyLambdaEx2 {
    void run02();
}


public class LambdaEx2 {

    public static void main(String[] args) {

        MyLambdaEx2 m = () -> {};
        // 람다식의 타입과 형변환
        Object obj = (MyLambdaEx2)(()->{}); // 양변의 타입이 다르므로 형변환 필요
        String str = ((Object)(MyLambdaEx2) (()->{})).toString();

        System.out.println(m);
        System.out.println(obj);
        System.out.println(str);

    }

}
