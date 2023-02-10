public class App {
    public static void main(String[] args) throws Exception {
        // ENCAPSULATION
        Person me = new Person();

        // set() method. changes the name
        me.setName("Gwenn");

        // get() method
        System.out.println(me.getName());

        // INHERITANCE
        // daughter object
        Daughter myself = new Daughter();

        System.out.println(myself.surname);

        myself.showSurname();
    }
}
