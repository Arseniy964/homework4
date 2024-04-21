public class Main {
    public static void main(String[] args) {
        Boss boss = createBoss();
        printBossInfo(boss);

        Hero[] heroes = createHeroes();
        printHeroesInfo(heroes);
    }

    public static Boss createBoss() {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");
        return boss;
    }

    public static void printBossInfo(Boss boss) {
        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(100, 20, "Flight");
        heroes[1] = new Hero(120, 25);
        heroes[2] = new Hero(90, 30, "Invisibility");
        return heroes;
    }

    public static void printHeroesInfo(Hero[] heroes) {
        System.out.println("\nHeroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }
}
