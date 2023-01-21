public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Sword object
        Weapon Sword = new Weapon();

        // properties
        Sword.name = "Katana";
        Sword.damage = 20;
        Sword.rarity = "Epic";
        Sword.addDamage(5);
        System.out.println(Sword.showNameandRarity());

        // new character
        Character hero = new Character();

        hero.strength = 10;
        hero.agility = 10;
        hero.intelligence = 5;
        hero.name = "Anzu";
        hero.sayMyName();
        hero.attack();
    }
}
