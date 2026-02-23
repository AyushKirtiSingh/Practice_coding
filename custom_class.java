class Employee{
    int id;
    String name;
    int Salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return Salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();  // Instantiating a new Employee Object
        Employee john = new Employee();  // Instantiating a new Employee Object


        // Setting Attributes for harry
        harry.id = 12;
        harry.name = "Codewithharry";
        harry.Salary = 34;


        // Setting Attributes for john
        john.id = 17;
        john.name = "John Tripathi";
        john.Salary = 78;

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int Salary = john.getSalary();
        System.out.println(Salary);
    }
}
