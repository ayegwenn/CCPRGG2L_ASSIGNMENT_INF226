public class Person {
   private String name = "Amber";

   // get() method. read only access
   public String getName() {
        return this.name;
   }

   // set() method. right access to put value 
   public void setName(String personName) {
        this.name = personName;
   }
}
