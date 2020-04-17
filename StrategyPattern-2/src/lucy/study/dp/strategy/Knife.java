package lucy.study.dp.strategy;

public class Knife implements Weapon{
    @Override
    public int doAttack(){
        System.err.println("attack knife");
        return 0;
    }
}
