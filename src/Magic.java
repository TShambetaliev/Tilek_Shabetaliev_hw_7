public class Magic extends Hero {

    public Magic (int health, int hit, SupAbility superpower) {
        super(health, hit, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + getSuperpowerType());
    }
}
