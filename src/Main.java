public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(250, 20, SupAbility.MAGIC_DAMAGE);
        heroes[1] = new Medic(250, 0, SupAbility.HEALTH, 20);
        heroes[2] = new Warrior(280, 15, SupAbility.PHYSICAL_DAMAGE);
        
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}