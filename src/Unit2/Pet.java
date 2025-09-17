package Unit2;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    public Pet(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void setWeight(double weight){
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive.");
        }
    }
    public void makeSound(){
        if (species.equals("Dog")) {
            System.out.println(name + " says Woof!");
        } else if (species.equals("Cat")){
            System.out.println(name + " says Meow!");
        } else {
            System.out.println(name + " makes a sound.");
        }
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " lbs");
        Pet pet1 = new Pet("Buddy", "Dog", 5, 35.0);
        pet1.displayInfo();
        pet1.makeSound();
        Pet pet2 = new Pet("Luna", "Cat", 3, 9.5);
        pet2.displayInfo();
        pet2.makeSound();
//Nothing appear in the terminal because we haven't told the program/system that we are going to
//display those pets. So even if they do have the basic information of those pets, they still need
//a command to display it.
        pet1.setAge(6);
        System.out.println(pet1.getName() + " is now" + pet1.getAge() + " years old");
        pet1.setWeight(-10);
    }
}
/*
Reflection Questions:
1. We make attributes private instead of public to first keep our files safe. Since without private,
anyone could access and print messages/texts which is very dangerous. So keeping attributes private
can help protect the data and hide internal details.
2. Method signature is a unique identifier for a method. One example in my code is public string getName
3.
 */
