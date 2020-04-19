package lucy.study.helper;

import lucy.study.helper.AbstGameConnectionHelper;

public class DefaultGameConnectHelper extends AbstGameConnectionHelper {
    @Override
    protected String doSecurity(String string){
        //System.err.println("decode");
        System.err.println("강화된 알고리즘 디코드");
        return string;
    };

    @Override
    protected boolean authentication(String id, String password){
        System.err.println("authentication");
        return true;
    };

    @Override
    protected int authorization(String username){
        System.err.println("authorization");
        // 서버에서 유저 이름 및 나이를 확인 후, 10시 이후 성인이 아닌 경우 권한 없는 것으로 리턴(-1)
        return 0;
    };

    @Override
    protected String connection(String info){
        System.err.println("connection");
        return null;
    };

}

