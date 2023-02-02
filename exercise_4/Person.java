public class Person {
    int age;
    String name;

    // constructor
    Person(int personAge, String personName) {
        this.name = personName;
        this.age = personAge;
    }

    // aggregation
    void addFriend(Person friend){
        System.out.println(this.name + " is friends with " + friend.name);
    }

    // add classmates: method
    void addClassmate(Person classmate){
        // i am classmates with:
        System.out.println("I am classmates with " +  classmate.name);
    }

    void addClassmate2(Person classmate2){
        System.out.println("I am classmates with " +  classmate2.name);
    }

    void addClassmate3(Person classmate3){
        System.out.println("I am classmates with " +  classmate3.name);
    }
}
