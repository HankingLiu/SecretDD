package Lab3;

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
//Nothing appear in the terminal because we haven't told the program/system that we are going to
//display those pets. So even if they do have the basic information of those pets, they still need
//a command to display it.

    }
}
/*
Reflection Questions:
1. We make attributes private instead of public to first keep our files safe. Since without private,
anyone could access and print messages/texts which is very dangerous. So keeping attributes private
can help protect the data and hide internal details.
2. Method signature is a unique identifier for a method. One example in my code is public string getName
3. A getter is when you give permission for classes and give them safe read-only access. While a setter
let us control how data is changed.
4. We add if-statements to filter the information that will be given to the audiences.
5. If we removed the "this." keyword in the constructor, the system will not know which variable or object
to take/use if there are multiple of them.
6. A method should return a value when its purpose is to compute information that the calling code
needs to use. It should return a void when the primary purpose is to do an action.
 */
