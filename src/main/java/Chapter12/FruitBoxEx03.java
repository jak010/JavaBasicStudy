package Chapter12;

import java.util.ArrayList;
import java.util.Arrays;

class FruitEx03 {
    public String toString() {
        return "Fruit";
    }
}

class AppleEx03 extends FruitEx03 {
    public String toString() {
        return " Apple";
    }
}

class GrapeEx03 extends FruitEx03 {
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + " Juice";
    }

    public String toString() {
        return name;
    }
}


class Juicer {
    static Juice makeJuice(FruitBoxExample03<? extends FruitEx03> box) {
        String tmp = "";

        for (FruitEx03 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx03 {
    public static void main(String[] args) {

        FruitBoxExample03<FruitEx03> fruitBoxEx3 = new FruitBoxExample03<FruitEx03>();
        FruitBoxExample03<AppleEx03> appleBoxEx3 = new FruitBoxExample03<AppleEx03>();

        fruitBoxEx3.add(new AppleEx03());
        fruitBoxEx3.add(new GrapeEx03());

        appleBoxEx3.add(new AppleEx03());
        appleBoxEx3.add(new AppleEx03());

        System.out.println(Juicer.makeJuice(fruitBoxEx3));
        System.out.println(Juicer.makeJuice(appleBoxEx3));
    }

}


class FruitBoxExample03<T extends FruitEx03> extends ExBox3<T> {
}

class ExBox3<T> {
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


