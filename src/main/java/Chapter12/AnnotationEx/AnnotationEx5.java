package Chapter12.AnnotationEx;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default  1;

}



public class AnnotationEx5 {
    public static void main(String[] args) {

        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);

        System.out.println(anno.count());

    }

}
