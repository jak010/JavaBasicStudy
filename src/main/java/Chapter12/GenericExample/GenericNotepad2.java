package Chapter12.GenericExample;


// 참조 변수를 통해 배열을 만드는 방법
class GenericTest<E> {

    private E[] elements;
    private int index;

    public GenericTest(int size) {
        this.elements = (E[]) new Object[size]; // 타입 안정성을 보장하지 못한다고함
    }

    public boolean save(E e) {
        if (index >= elements.length) return false;

        elements[index++] = e;
        return true;
    }

    void showElements() {
        for (int i=0; i <elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

}


public class GenericNotepad2 {

    public static void main(String[] args) {

        GenericTest<String> a = new GenericTest<>(5);

        a.save("a");

        a.showElements();

    }

}
