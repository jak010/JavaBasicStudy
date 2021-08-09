package Chapter12.GenericExample;


import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

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

class Box1<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}


public class FruitBoxEx1 {
    public static void main(String[] args) {

        // 1.3 제네릭 클래스의 객채 생성과 사용
        Box1<Fruit> fruitBox1 = new Box1<Fruit>();
        Box1<Apple> appleBox1 = new Box1<Apple>();
        Box1<Toy> toyBox1 = new Box1<Toy>();

        // Box1<Grape> grapeBox1 = new Box1<Fruit>(); <-- 이건 안됨

        fruitBox1.add((new Fruit()));
        // 상속 관계에 있으면 상관 x
        fruitBox1.add((new Apple()));
        fruitBox1.add((new Grape()));

        // 상위 개념으로 타입을 가져다 쓰면?
        //appleBox1.add(new Fruit()); // --> 안됨


        // appleBox1 은 Apple타입만 담을 수 있음

        appleBox1.add(new Apple());
        // appleBox1.add(new Toy()); <-- error 임


        //  Book: FruitBoxEx1.java (657p)
        //  책에서 말하고자 하는 건 위가 다인듯

    }
}

