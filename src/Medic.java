public class Medic extends Hero {
private int healPoints;

    public Medic(int health, int hit, SupAbility superpowerType,int healPoints) {
        super(health, hit, superpowerType);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {

        System.out.println("Medic применил суперспособность" + getSuperpowerType());
    }

    public int increaseExperience(){
        this.healPoints = healPoints / 10 + healPoints;
        return this.healPoints;
    }
}
