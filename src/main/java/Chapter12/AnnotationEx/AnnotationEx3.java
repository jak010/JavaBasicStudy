package Chapter12.AnnotationEx;

import java.util.ArrayList;

class NewClass2 {
    int newField;

    int getNewField(){
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }

}

public class AnnotationEx3 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        NewClass nc = new NewClass();
        // AnnoationEx2.java 에서 취소선 처리가 사라짐
        nc.oldField = 10;
        System.out.println(nc.getOldField());

//       Annotation 먼저 달고 쓰면 경고가 발생 하더라..
        @SuppressWarnings("unchecked")
        ArrayList<NewClass> list = new ArrayList<>();
        list.add(nc);

    }
}
