package Chapter12.EnumsPractice;

enum Transportation {
    // 2. 각 운송 수단 마다 추상 메소드 fare를 구현함
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLAIN(300) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE; // 3. protected로 해야 각 상수에서 접근 가능

    Transportation(int basic_fare) {
        BASIC_FARE = basic_fare;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }

    // 1. 열거형 안에 추상 메소드를 정의
    abstract int fare(int distance);

}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare="+Transportation.BUS.fare((100)));
        System.out.println("train fare="+Transportation.BUS.fare((100)));
        System.out.println("ship fare="+Transportation.BUS.fare((100)));
        System.out.println("airplane fare="+Transportation.BUS.fare((100)));

    }
}
