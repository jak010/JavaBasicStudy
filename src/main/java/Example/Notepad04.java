package Example;


import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class People {

    private String name;
    private int age;
    private int gender;

    public People(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public static List<People> getPeopleList() {
        return Arrays.asList(
            new People("홍길동", 16, 1),
            new People("홍길자", 18, 2),
            new People("홍길순", 15, 2),
            new People("홍길철", 17, 1)
        );
    }

    @Override
    public String toString() {
        return "People{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            '}';
    }
}


public class Notepad04 {

    public static void main(String[] args) {

        // stream을 이용하여 특정 조건에 만족하는 데이터만 뽑아내기
        List<People> femaleList = People.getPeopleList().stream().filter(
            people -> people.getGender() == 2).collect(Collectors.toList()
        );
        femaleList.forEach(System.out::println);

    }
}
