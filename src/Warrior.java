public class Warrior extends Hero {

    public Warrior (int health, int hit, SupAbility superpower) {
        super(health, hit, superpower);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность" + getSuperpowerType());
    }
}
