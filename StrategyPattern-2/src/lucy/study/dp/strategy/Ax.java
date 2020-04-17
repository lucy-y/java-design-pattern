package lucy.study.dp.strategy;

public class Ax implements Weapon{
    @Override
    public int doAttack(){
        System.err.println("ax sword");
        return 0;
    }
}
