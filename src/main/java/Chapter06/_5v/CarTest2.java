package Chapter06._5v;

class Car02 {
    String color;
    String gearType;
    int door;

    Car02() {
        this("white", "auto", 4);
    }

    Car02(String color) {
        this(color, "auto", 4);
    }

    Car02(String color, String gearType, int door) {
        // 생성자의 매개변수로 인스턴스 변수들의 초기값을 제공받는 경우가 많음 (매개변수와 인스턴스 변수의 이름이 일치하는 경우가 있음)

        // this 는 참조변수로 인스턴스 자신을 가리킴
        // 01. this를 사용할 수 있는 것은 인스턴스멤버 뿐
        // 02. static 메서드 에서는 인스턴스 멤버들을 사용할 수 없는 것처러 this 사용 불가
        // 03. 인스턴스 메서드에서는 this가 지역변수로 숨겨진 채 존재함
        //
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car02 c1 = new Car02();
        Car02 c2 = new Car02("blue");

        System.out.println(c1.color + " " + c1.gearType + " " + c1.door);
        System.out.println(c2.color + " " + c2.gearType + " " + c2.door);

    }

}
