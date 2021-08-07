package Chapter12;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

// Fruit를 상속받은 class 들
class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}


class Toy {
    public String toString() {
        return "Toy";
    }
}

class GenericBoxExample<T> {
    ArrayList<T> list = new ArrayList<T>();

    //    ArrayList에 원소를 더하자
    void add(T item) {
        list.add(item);
    }

    //    ArrayList에 원소를 꺼내자
    T get(int i) {
        return list.get(i);
    }

    //    ArrayList에 크기를 반환
    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}


public class FruitBoxEx1 {

    public static void main(String[] args) {

        GenericBoxExample<Fruit> fruitbox = new GenericBoxExample<Fruit>();
        GenericBoxExample<Apple> applebox = new GenericBoxExample<Apple>();
        GenericBoxExample<Grape> grapebox = new GenericBoxExample<Grape>();

        GenericBoxExample<Toy> toybox = new GenericBoxExample<Toy>();

//     CASE 01: 타입이 다름
//        GenericBoxExample<Grape> grapeBox = new GenericBoxExample<Apple>();

        fruitbox.add(new Fruit());

        /* 타입이 Fruit가 될 경우, 사용가능
         *  상속 관계에서 SubClass는 매개변수로 넘겨줄 수 있음
         * */
        fruitbox.add(new Apple());

        /* ============================== */

        applebox.add(new Apple());
//      CASE 02: applebox는 타입이 Apple만 담을 수 있음
//        applebox.add(new Toy());

        toybox.add(new Toy());

        System.out.println(fruitbox);
        System.out.println(applebox);
        System.out.println(toybox);
    }
}
