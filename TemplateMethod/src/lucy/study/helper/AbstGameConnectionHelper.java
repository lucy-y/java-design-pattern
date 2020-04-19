package lucy.study.helper;

public abstract class AbstGameConnectionHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String username);
    protected abstract String connection(String info);

    public String requestConnection(String str){
        String decodedInfo = doSecurity(str);
        String id = "aaa";
        String passsword = "bbb";

        if(!authentication(id, passsword)){
            throw new Error("Not match Id or Password");
        }
        String username = "ccc";
        int authorizationValue = authorization(username);
        switch (authorizationValue){
            case -1:
                System.err.println("");
                throw new Error("shutDown");
            case 0:
                System.err.println("manager");
                break;
            case 1:
                System.err.println("vip member");
                break;
            case 2:
                System.err.println("member");
                break;
            case 3:
                System.err.println("no access");
                break;
            default:
                System.err.println("etc");
                break;
        }
        return connection(str);
    }
}
