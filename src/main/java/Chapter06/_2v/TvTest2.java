package Chapter06._2v;

class Tv02 {
    String color;
    boolean poweer;
    int channel;

//    void power() {
//        power != power;
//    }

    void channlUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvTest2 {
    public static void main(String[] args) {

        Tv02 t1 = new Tv02();
        Tv02 t2 = new Tv02();

        // 멤버 변수를 초기화 안 한 상태
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7; // 멤버 변수 초기화
        System.out.println(t1.channel); // 결과 7
        System.out.println(t2.channel); // 결과 0

    }

}
