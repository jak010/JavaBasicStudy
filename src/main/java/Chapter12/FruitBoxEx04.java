package Chapter12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class FruitEx4 {
    String name;
    int weight;

    FruitEx4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class AppleEx4 extends FruitEx4 {
    AppleEx4(String name, int weight) {
        super(name, weight);
    }
}

class GrapeEx4 extends FruitEx4 {
    public GrapeEx4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<AppleEx4> {
    public int compare(AppleEx4 t1, AppleEx4 t2) {
        return t2.weight - t1.weight;
    }
}


class GrapeComp implements Comparator<GrapeEx4> {
    public int compare(GrapeEx4 t1, GrapeEx4 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<FruitEx4> {
    public int compare(FruitEx4 t1, FruitEx4 t2) {
        return t1.weight - t2.weight;
    }
}


public class FruitBoxEx04 {
    public static void main(String[] args) {
        /*
         *  이 예제는 Collections.sort() 를 이용해서 appleBox와 grapeBox에 담긴
         *   과일을 무게별로 정렬한다.
         * */

        FruitBoxEx4<AppleEx4> appleBox = new FruitBoxEx4<AppleEx4>();
        FruitBoxEx4<GrapeEx4> grapeBox = new FruitBoxEx4<GrapeEx4>();

        appleBox.add(new AppleEx4("Green Apple", 300));
        appleBox.add(new AppleEx4("Green Apple", 100));
        appleBox.add(new AppleEx4("Green Apple", 200));

        grapeBox.add(new GrapeEx4("GreenGrape", 400));
        grapeBox.add(new GrapeEx4("GreenGrape", 300));
        grapeBox.add(new GrapeEx4("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());


        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}


class FruitBoxEx4<T extends FruitEx4> extends BoxEx4<T> {
};


class BoxEx4<T> {

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