package Chapter09;

class Card02 {
    String kind;
    int number;

    Card02() {
        this("SPADE", 1);
    }

    Card02(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "Kind: " + kind + ", number: " + number;
    }

}

public class CardToString2 {
    public static void main(String[] args) {
        Card02 c1 = new Card02();
        Card02 c2 = new Card02("Head", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
