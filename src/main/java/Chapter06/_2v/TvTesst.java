package Chapter06._2v;

class Tv {
    String color;
    boolean power;
    int channel;

//    Error !
//    void power() {
//        power != power;
//    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}

public class TvTesst {

    public static void main(String[] args) {

//         책에서 선언하는 방식
        Tv t;
        t = new Tv();


        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널 is " + t.channel);

    }
}
