public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int hit;
    private SupAbility superpowerType;

    public Hero(int health, int hit, SupAbility superpowerType) {
        this.health = health;
        this.hit = hit;
        this.superpowerType = superpowerType;
    }

    @Override
    public void applySuperAbility() {
        System.out.println(superpowerType);
    }
    public String getSuperpowerType() {
        return superpowerType.toString().replace("_", " ");
    }
}
