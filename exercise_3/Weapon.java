public class Weapon {
    String name;
    String rarity;
    int damage;

    // addDamage() method
    void addDamage(int plusDamage) {
        int newDamage = this.damage + plusDamage;

        System.out.println("Damage has been added. " + damage + " damage becomes " + newDamage + ".");
        this.damage = newDamage;
    }

    // showNameandRarity() method
    String showNameandRarity() {
        return "Name: " + this.name + "\nRarity: " + this.rarity;
    }
}
