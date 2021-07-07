package Chapter14.lambdaExGroup;

// 02. 람다는 인터페이스나 클래스가 필요
interface MyFunctionEx01 {
    int max(int a, int b);
}

// 03. 람다식을 다루기 위한 함수형 인터페이스
@FunctionalInterface
interface MyFuncionEx03 {
    int max(int a, int b);
}

public class LambdaEx01 {


    public static void main(String[] args) {
//      01. 직관적으로 보는 람다 사용방식
        MyFunctionEx01 f = (a, b) -> a > b ? a : b;
        int big = f.max(5, 3);
        System.out.println(big);
    }
}
