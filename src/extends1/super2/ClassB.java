package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        // super(); 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        System.out.println("ClassB 생성자 a = " + a + " b = " + b);
    }
}
