package Chapter06._2v;

class Tv03 {
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

public class TvTest3 {
    public static void main(String[] args) {

        Tv03 t1 = new Tv03();
        Tv03 t2 = new Tv03();

        System.out.println(t1.channel);
        System.out.println(t2.channel);


        t2 = t1; // 인스턴스 복사
        t1.channel = 8;

        System.out.println(t1.channel);
        System.out.println(t2.channel);


    }
}
