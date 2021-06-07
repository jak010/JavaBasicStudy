package Chapter06._3v;

import javax.sound.midi.Soundbank;

class Card {
    String kind;
    int number;

    // 클래스 변수
    static int width = 100;
    static int height = 250;
}

public class CarTest {

    public static void main(String[] args) {

        // 클래스 변수는 클래스로 접근 가능
        System.out.println(Card.width);
        System.out.println(Card.height);

        // 인스턴스 변수는 인스턴스화 해서 사용
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 8;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 2;

        System.out.println(c1.kind);
        System.out.println(c1.number);

        System.out.println(c2.kind);
        System.out.println(c2.number);

        // 인스턴스를 통해 클래스 변수으 값을 변경 가능
        c1.width = 999;
        c1.height = 9999;
        System.out.println("===========================");
        System.out.println(c1.width);
        System.out.println(c1.height);
        System.out.println("===========================");
        System.out.println(c2.width);
        System.out.println(c2.height);


    }
}
