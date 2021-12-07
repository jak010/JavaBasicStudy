package main.java.Chapter06._3v9;
// xxx: 위 패키지 에러는 신경 안써도 됨
//  - 에러 표시 뜨는 이유는 찾아보기


class Data {
    int x;
}

public class ReferenceReturnEx {
//    public static void main(String[] args) {
//        Data d = new Data();
//        d.x = 10;
//
//        Data d2 = copy(d);
//        System.out.println("d.x = " + d.x);
//        System.out.println("d2.x = " + d2.x);
//    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;

    }
}