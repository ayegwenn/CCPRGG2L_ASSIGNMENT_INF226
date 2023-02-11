public class App {
    public static void main(String[] args) throws Exception {
       // POLYMORPHISM
       GroceryItem item1 = new Diaper();
       item1.name = "Huggies";
       item1.showItemName();
       item1.price = 100;

       GroceryItem item2 = new Bodywash();
       item2.name = "Dove"; 
       item2.showItemName();
       item2.price = 300;

       // cashier
       Cashier c1 = new Cashier();

       c1.checkOut(item1);
       c1.checkOut(item2);
       c1.itemPrice(item1);
       c1.itemPrice(item2);
       

       // polymorphic array. another technique
       GroceryItem[] itemArray = new GroceryItem[2];

       itemArray[0] = item1;
       itemArray[1] = item2;

       double total = 0.00;
       for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            total += itemArray[i].price;
       }

       System.out.println("Your total amount is " + total + " pesos.");

       // ABSTRACTION
       Rabbit myRabbit = new Rabbit();
       myRabbit.eat();
    }
}
