public class Cashier {
    public void checkOut(GroceryItem item){
        System.out.println("You have purchased " + item.name);
    }

    public void itemPrice(GroceryItem item){
        System.out.println(item.name + " costs " + item.price + " pesos.");
    }
}
