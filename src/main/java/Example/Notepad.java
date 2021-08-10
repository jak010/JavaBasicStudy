package Example;

class Parent {
    int a = 10;
}

class Child extends Parent {

    int a = 20;

    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }


}

public class Notepad {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();


    }
}
