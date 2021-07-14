package Chapter09;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}


public class CardToString {

    public static void main(String[] args) {

        Card c1 = new Card();
        Card c2 = new Card();
        // toString은 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
