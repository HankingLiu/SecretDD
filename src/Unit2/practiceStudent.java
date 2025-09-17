package Unit2;

public class practiceStudent {
    //attributes are class variables responsible for storing data in objects
    //what properties the objects will have
    String name;
    int age;
    String id;
//private String name, makes it unaccessible bny attempts of any direct modification
    //private locks the access to this data from any other classes
    //Constructor


    //Behavior or methods
    //what actions objects can take
    public void printStudentInfo(){
        System.out.println(name + ", " + age + ", " + id);
    }

    public static void printWelcomingMessage(String studentName){
        System.out.println(studentName + "," + "Welcome to our school!");
    }

    public static void main(String[] args){
        //create the variable student
        //Type name = new Type()
        practiceStudent student1 = new practiceStudent();//this is a real object that lives in RAM
        student1.printStudentInfo();
        student1.name="Hanking";
        student1.id="24513";
        student1.age=15;
        student1.printStudentInfo();

        student1.id="98920";
        student1.age=16;
        student1.printStudentInfo();
        //we need attributes to store information about our objects

        practiceStudent.printWelcomingMessage(student1.name);
        //static functions are only accessible from the Class itself
        //like Math.sqrt(), Math.round()

        //static functions are used either as elements of static
        //libraries of functions (as Math class0
        //in OOP also static functions are used to represent a behavior
        //shared by ALL objects of that type
        practiceStudent.printWelcomingMessage("Harry");
        //it maye be useful for example in situations when you want
        //to know how many objects of the given type you have created
    }
}
