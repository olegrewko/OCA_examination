package IgorDolgov;

public class RPGame {
    public static void main (String[] args) {
        int hp = testRandom(50, 420);
        int damage = testRandom(520, 750);
        int shield = testRandom(0, 8);

        System.out.printf("hp: %d damage: %d, shield: %d%n", hp, damage, shield);
        int resultDamage = damage - shield;
        if (resultDamage > 0) {
            hp -= resultDamage;
            damage -= shield;
            shield = 0;
        } else {
            shield -= damage;
            damage = 0;
        }
        System.out.printf("hp: %d damage: %d, shield: %d%n", hp, damage, shield);
    }

    static int testRandom (int from, int to) {
        int result;
        result = (int) (from + Math.random() * (to - from));
        return result;

    }
}
