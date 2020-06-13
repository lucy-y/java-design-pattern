public class SystemSpeaker {
    static private SystemSpeaker instance;
    private int volume;
    private SystemSpeaker(){
        volume = 5;

    }

    public static SystemSpeaker getInstance(){
        if (instance == null) {
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolumn(int volume){
        this.volume = volume;
    }

}