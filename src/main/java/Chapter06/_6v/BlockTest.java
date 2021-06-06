package Chapter06._6v;

public class BlockTest {

    static {
        // 클래스 초기화 블럭
        // 클래스 초기화 블럭은 클래스가 메모리에 올라가는 시점에 한 번만 실행
        // 즉, 여러 인스턴스를 생성해도 한번만 실행
        System.out.println(" static {} ");
    }

    {
        // 인스턴스 초기화 블럭
        System.out.println(" {}");
    }

    public BlockTest() {
        System.out.println(" 생성자");
    }

    public static void main(String[] args) {

        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest()");
        BlockTest b2 = new BlockTest();


    }
}
