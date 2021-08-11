package Chapter12.AnnotationEx;


class Parent {
    void parentMethod(){};
}

class Child extends  Parent {

//    Override Annoation은 부모 클래스의 메소드를 제대로 상속받았는지 검사해줌
//    parentMethod()의 철자를 틀리게 하면?
    @Override
    void parentMethod() {}
}



public class AnnotationEx01 {

    public static void main(String[] args) {



    }

}
