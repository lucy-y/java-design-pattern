public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        // 객체를 생성하지 않고 interface 선언 후 구현하고 메소드 호출
        ainterface.funcA();

        // 객체 내 구현체 이용한 코드
        AObj aObj = new AObj();
        aObj.funcAA();

    }
}

