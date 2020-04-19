public class Main {

    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.err.println(adapter.twiceOf(100f));
        System.err.println(adapter.halfOf(88f));
    }
}

