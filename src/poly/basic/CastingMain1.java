package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수 -> 자식 인스턴스
        Parent poly = new Child();

        // 자식 기능 호출 불가
        // poly.childMethod();

        // 다운 캐스팅
        Child child = (Child) poly;
        child.childMethod();

        // ((Child)poly).childMethod();
    }
}
