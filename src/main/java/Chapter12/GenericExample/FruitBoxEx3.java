package Chapter12.GenericExample;

import java.util.ArrayList;

// 1. 제네릭 클래스 선언
class Box3<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class Fruit3 {

    public String toString() {
        return "Fruit3";
    }
}

class Apple3 extends Fruit3 {

    public String toString() {
        return "Apple3";
    }
}

class Grape3 extends Fruit3 {

    public String toString() {
        return "Grape3";
    }
}

class Juice {
    String name;

    public Juice(String name) {
        this.name = name +"Juice";
    }

    public String toString() {
        return name;
    }
}


class Juicer {
    static Juice makeJuice(FruitBox3<? extends Fruit3> box) {
        String tmp = "";
        for (Fruit3 f: box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

// 2. 와일드 카드의 상한 제한
// Fruit 클래스를 상속받은 Apple, Grape 만 받을 수 있음
class FruitBox3<T extends Fruit3> extends Box3<T> {};


public class FruitBoxEx3 {
    public static void main(String[] args) {

        FruitBox3<Fruit3> fruitbox = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> applebox = new FruitBox3<Apple3>();

        fruitbox.add(new Apple3());
        fruitbox.add(new Grape3());
//        fruitbox.add(new Toy3()); // 3. Error

        applebox.add((new Apple3()));
//        applebox.add((new Grape3())); 당연히 안됨, Apple3 타입만 받을 수 있으니께

        System.out.println(Juicer.makeJuice(fruitbox));
        System.out.println(Juicer.makeJuice(applebox));
    }

}
