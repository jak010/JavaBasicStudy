package Chapter06._5v;

class Car03 {
    String color;
    String gearType;
    int door;

    Car03() {
        this("white" , "auto", 4);
    }

    Car03(Car03 c) {
        color = c.color;
        gearType = c.gearType;
        door =c.door;
    }
    Car03(String color, String gearType, int door) {
        this.color  = color;
        this.gearType = gearType;
        this.door = door;
    }

}

public class CarTest3 {

    public static void main(String[] args) {

        Car03 c1 = new Car03();
        Car03 c2 = new Car03(c1);

        // 서로 독릭접으로 메모리 공간에 존재하는 별도의 인스턴스이므로 c1의 값들이 변경되어도
        // c2는 영향을 받지 않음

    }

}
