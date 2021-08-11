package Chapter12.GenericExample;

class Box5<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class GenericTypeConverEx01 {
    public static void main(String[] args) {

        Box5 normalBox = null;
        Box5<Object> sampleBox = null;

//       1. 지네릭 타입과 원시 타입의 형변환이 가능할까?
//        A). 됨, 경고가 발생할 뿐임
        normalBox = (Box5)normalBox; // Generic -> Raw 경고발생
        sampleBox = (Box5<Object>)sampleBox; // Raw -> Generic 경고발생

        System.out.println(normalBox);
        System.out.println(sampleBox);

//        2. 대입된 타입이 다른 지네릭 타입 간에는 형변환이 가능할까?
//        A) 안됨, 왜 안될까? (참조 타입이 달라서?)
        Box5<Object> objBox = null;
        Box5<String> strBox = null;


        //objBox = (Box5<Object>) strbox;
        //strBox = (Box5<String>) objBox;

//      3. 와일드 카드 타입 간의 형변환?
        Box5<? extends Object> wBox = new Box5<String>();

//        Box5<? extends String> wBox2 = new Box5<Object>(); // 요건 안됨 ㅋ


        Box5<? super String> wbox4 =new Box5<Object>(); // 요건 됨 ㅋㅋ

//      4. 그 외
//      <?> == <? extends Object>
//        Box5<?> wBox5 = new Box5<?>(); // 주석 해제
        Box5<?> wBox6 = new Box5<Object>(); //ok
        Box5<? extends Object> wBox7 = new Box5<Object>(); //ok

    }
}
