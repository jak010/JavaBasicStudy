package Chapter12.GenericExample;

// 제네릭 클래스는 다음과 같이 만들면 된다
// T: Type Variable이란 뜻

class MyGenericBox<T> {

    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

}


public class GenericNotepad {
    public static void main(String[] args) {

        // 1. 제네릭 클래스 써먹기
        MyGenericBox<String> mb = new MyGenericBox<String>();

        mb.setItem("abc");
        System.out.println(mb.getItem());

        // 2.
        // Q) 제네릭 클래스 타입을 지정하지 않고 사용하면 어떻게 되나?
        // A) unchecked or unsafe operations.

        // Q) 왜 사용할 수 있는가?
        // A) 제네릭은 java 1.5 이후 등장함, 이전 코드와 호환을 위함
        MyGenericBox mb2 = new MyGenericBox();

        mb2.setItem("abc"); // Warning
        System.out.println(mb2.getItem());

    }
}
