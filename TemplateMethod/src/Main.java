import lucy.study.helper.AbstGameConnectionHelper;
import lucy.study.helper.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectionHelper helper = new DefaultGameConnectHelper();
        // AbstGameConnectionHelper 내 public만 접근가능.
        // protected abstract 로 정의된 메소드는 같은 패키지 및 하위 클래스에서 구현가능 :)
        helper.requestConnection("account info");
    }
}
