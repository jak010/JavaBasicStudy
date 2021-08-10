package Chapter12.GenericExample;


import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Box4<T> {
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

class FruitBox4<T extends Fruit4> extends Box4<T> {
};

class Fruit4 {
    String name;
    int weight;


    public Fruit4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "{" + weight + "}";
    }
}


class Apple4 extends Fruit4 {

    public Apple4(String name, int weight) {
        super(name, weight);
    }
}

class Grape4 extends Fruit4 {

    public Grape4(String name, int weight) {
        super(name, weight);
    }
}


class AppleComp4 implements Comparator<Apple4> {

    public int compare(Apple4 t1, Apple4 t2) {
        return t2.weight - t1.weight;

    }
}

class GrapeComp4 implements Comparator<Grape4> {

    public int compare(Grape4 t1, Grape4 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp4 implements Comparator<Fruit4> {


    public int compare(Fruit4 t1, Fruit4 t2) {
        return t2.weight - t1.weight;
    }
}


public class FruitBoxEx4 {
    public static void main(String[] args) {

        FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
        FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();


        appleBox.add(new Apple4("GreenApple", 300));
        appleBox.add(new Apple4("GreenApple", 100));
        appleBox.add(new Apple4("GreenApple", 200));

        grapeBox.add(new Grape4("GreenGrape", 400));
        grapeBox.add(new Grape4("GreenGrape", 300));
        grapeBox.add(new Grape4("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp4());
        Collections.sort(grapeBox.getList(), new GrapeComp4());

        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp4()); // 1. Apple4 타입으로 선언되었지만 FruitComp4로 정렬이 가능한 이유는 super를 와일드 카드로 쓰기 떄문
        Collections.sort(grapeBox.getList(), new FruitComp4());

        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}
