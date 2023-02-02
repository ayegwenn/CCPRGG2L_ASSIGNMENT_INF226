public class App {
    public static void main(String[] args) throws Exception {
            Person Me = new Person(18, "Amber");
            
            Person Friend = new Person(23, "Yeonjun");
            // call aggregation
            Me.addFriend(Friend);

            // composition
            Pet Dog = new Pet(1, "Anya", Me);
            Dog.showOwner();

            // add classsmate: object
            Person Classmate = new Person(18, "Aalliyah");
            Me.addClassmate(Classmate);
            Person Classmate2 = new Person(19, "Kate");
            Me.addClassmate2(Classmate2);
            Person Classmate3 = new Person(18, "Bianca");
            Me.addClassmate3(Classmate3);

            // car
            Car Mazda = new Car("black", "Mazda Miata MX-5", Me);
            Mazda.showOwner();
    }
}
