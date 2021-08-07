package Chapter12;

import java.lang.reflect.GenericSignatureFormatError;

interface Eatable {
};


class FruitEx02 implements Eatable {
    public String toString() {
        return "Fruit";
    }

}

class AppleEx02 extends FruitEx02 {
    public String toString() {
        return "Apple";
    }
}

class GrapeEx02 extends FruitEx02 {
    public String toString() {
        return "Grape";
    }
}

class ToyEx02 {
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx2 {
    public static void main(String[] args) {

        FruitBox<FruitEx02> fruitboxex02 = new FruitBox<FruitEx02>();
        FruitBox<AppleEx02> appleboxex02 = new FruitBox<AppleEx02>();
        FruitBox<GrapeEx02> grapeboxex02 = new FruitBox<GrapeEx02>();

//        Generice Type Error
//        타입 불일치
//        GenericBox<GrapeEx02> grapeboxex02_1= new GenericBox<AppleEx02>();

//        FruitEx02를 상속 받지 않은 타입으로 생성할 수 없음
//        FruitBox<ToyEx02> toyboxex02 = new FruitBox<ToyEx02>();


        fruitboxex02.add(new FruitEx02());
        fruitboxex02.add(new AppleEx02());
        fruitboxex02.add(new GrapeEx02());
        appleboxex02.add(new AppleEx02());
//        appleboxex02.add(new GrapeEx02());

    }

}

class FruitBox<T extends FruitEx02 & Eatable> extends GenericBoxExample<T> {}
