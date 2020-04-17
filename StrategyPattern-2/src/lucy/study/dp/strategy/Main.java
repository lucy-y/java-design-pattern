package lucy.study.dp.strategy;

public class Main {
    public static void main(String[] args) {

        GameCharacter character = new GameCharacter();

        character.setWeapon(new Sword());
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Ax());
        character.attack();

    }
}
