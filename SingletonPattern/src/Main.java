public class Main {
    public static void main(String[] args){
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.err.println(speaker1.getVolume());
        System.err.println(speaker2.getVolume());

        speaker1.setVolumn(10);
        System.err.println(speaker1.getVolume());
        System.err.println(speaker2.getVolume());

        speaker1.setVolumn(20);
        System.err.println(speaker1.getVolume());
        System.err.println(speaker2.getVolume());

    }
}