// Parent class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("The animal makes a sound");
    }

    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog("Buddy", 3);

        // Access the inherited variable
        System.out.println("Name: " + myDog.name);

        // Access the inherited method
        myDog.sound();

        // Access the unique method of Dog class
        myDog.bark();

        // Access the age variable of Dog class
        System.out.println("Age: " + myDog.getAge());
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public void bark() {
        System.out.println("The dog named " + name + " is barking");
    }

    public int getAge() {
        return age;
    }
}
