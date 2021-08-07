package Chapter12;

//   1.2 제네릭 클래스의 선언
//   아래와 같이 선언된 클래스를 제네릭 클래스로 변경하려면?
class Box {
    Object item;

    void setItem(Object item) {
        this.item = item;
    }

    Object getItem() {
        return item;
    }


}

//   Box 클래스를 제네릭 클래스로 변경
class GenericBox<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}


public class Chapter12Example01 {

    public static void main(String[] args) {

//      제네릭이 적용되지 않은 클래스
        Box squareBox = new Box();

//      제네릭이 적용된 클래스
        GenericBox<String> squareBoxFlex = new GenericBox<String>();
//      제네릭이 적용된 클래스에 타입을 넘겨주면 다음과 같이 정의되어 있는 거라 생각하면 편함
        /*
         *  class GenericBox{
         *       String item;
         *       void setItem(String item) { this.item = item; }
         *       String getItem() {return item; }
         * }
         *
         * */

//      Page 671, 제네릭이 적용된 클래스에 타입을 지정하지 않고 사용해보자
        GenericBox squareboxflex02 = new GenericBox();

        // 코드 실행은 되나 아래와 같은 경고가 뜸
        // Warning: Unchecked call to 'setItem(T)' as a member of raw type 'Chapter12.GenericBox'
        squareboxflex02.setItem("ABC");
        squareboxflex02.setItem(new Object());

 //     실행되는 이유?
        //   - 제네릭이 도입되기 이전의 코드와 호환을 위해 제네릭 클래스인데도 예전의 방식으로 객체를 생성하는 것이 허용됨

//      남궁성 왈
        //  코드 호환성을 위해 제네릭스를 사용하지 않은 코드를 허용하는 것일 뿐이고 제네릭 클래스를 사용할 떄는 반드시 타입을 지정해서
        //  제네릭스와 관련된 경고가 나오지 않도록 하자


    }
}
