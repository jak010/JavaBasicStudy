package Chapter12.AnnotationEx;

class NewClass {

    int newField;

    int getNewField() {return newField;}

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){return oldField;}

}

public class AnnotationEx2 {
    public static void main(String[] args) {

        NewClass nc = new NewClass();

//        Deprecated가 붙은 필드는 취소선 처리를 해주는 듯함
        nc.oldField = 10;
        System.out.println(nc.getOldField());

    }
}
