package Chapter14;

@FunctionalInterface
interface MyLambdaEx2 {
    void run02();
}


public class LambdaEx2 {

    public static void main(String[] args) {

        MyLambdaEx2 m = () -> {};
        Object obj = (MyLambdaEx2)(()->{});
        String str = ((Object)(MyLambdaEx2) (()->{})).toString();

        System.out.println(m);
        System.out.println(obj);
        System.out.println(str);

    }

}
