package Unit2;

import java.sql.SQLOutput;

public class Car {
    //attributes
    String model;
    int year;
    static int counter;//this attribute belongs to the class Car not to a single Car object

    //Constructor is a special method that creates an object usually by assigning values to attributes
    public Car(String m, int y){
        model = m;
        year = y;
        counter++;//adding each new instance of a Car class
    }
    public static void howManyCars(){
        System.out.println("We have " + counter + " cars");
    }
    public static void main(String[] args){
        Car car1 = new Car("Tesla", 2021);//+1
        Car car2 = new Car("BMW", 2022);//+1
        Car car3 = new Car("BYD", 2024);//+1
        howManyCars();//calling a static method from the class Car

        //According to the best principles of OOP we should not access attributes and modify them
        //directly as we dit it in a student class.
        //a Student class
        //student.name = "John" X
        //instead we have two options
        //either pass the name as a parameter like
        //Student student = new student("John");
        //or
        //we can use a method setName() that can modify our class attributes

        //encapsulation - one of the most important OOP concepts
        //classes must protect data from direct access
        //and it can be achieved by using access modifiers private, protected, public or default
    }
}
