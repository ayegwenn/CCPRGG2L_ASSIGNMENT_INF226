public class Pet {
    int age;
    String name;
    Person owner; // dependency

    // constructor
    Pet(int petAge, String petName, Person ownerName){
        this.age = petAge;
        this.name = petName;
        this.owner = ownerName;
    }

    // method
    void showOwner(){
        System.out.println("My name is " + this.name + ". My owner's name is " + owner.name);
    }
}
