package lucy.study.dp.strategy;

public class Sword implements Weapon{
    @Override
    public int doAttack(){
        System.err.println("attack sword");
        return 0;
    }
}
