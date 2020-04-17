package lucy.study.dp.strategy;

public class GameCharacter {

    private Weapon weapon;

    public int attack(){
        return weapon.doAttack();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

}
