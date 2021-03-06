package Chapter12.EnumsPractice;

enum DirectionEx02 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final DirectionEx02[] DIR_ARR = DirectionEx02.values();
    private final int value;
    private final String symbol;

    //   생성자를 이용하면 Enum에 값을 조정가능
    DirectionEx02(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static DirectionEx02 of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value:" + dir);
        }
        return DIR_ARR[dir - 1];
    }

    public DirectionEx02 rotate(int num) {
        num = num % 4;
        if (num < 0) num += 4; // num이 음수일 때는 시계반대 방향으로 회전
        return DIR_ARR[(value - 1 + num) % 4];
    }


    public String toString() {
        return name() + getSymbol();
    }
}

public class EnumEx2 {
    public static void main(String[] args) {
        for (DirectionEx02 d : DirectionEx02.values()) {
            System.out.printf("%s=%d\n", d.name(), d.getValue());
        }

        DirectionEx02 d1 = DirectionEx02.EAST;
        DirectionEx02 d2 = DirectionEx02.of(1);

        System.out.printf("d1=%s, %d\n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d\n", d2.name(), d2.getValue());

        System.out.println(DirectionEx02.EAST.rotate(1));
        System.out.println(DirectionEx02.EAST.rotate(2));
        System.out.println(DirectionEx02.EAST.rotate(-1));
        System.out.println(DirectionEx02.EAST.rotate(-2));
    }
}
