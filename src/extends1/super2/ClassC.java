package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); // ClassB의 기본 생성자가 없음
        System.out.println("ClassC 생성자");
    }
}
