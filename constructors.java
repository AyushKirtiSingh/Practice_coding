class MyMainEmployee{
    private int id;
    private String name;
    private int salary;


    public MyMainEmployee(){
        id = 4;
        name = "harry";

    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;

    }

    public MyMainEmployee(String myName){
        name = myName;
        id = 2;

    }

    public MyMainEmployee(int mySalary){
        salary = mySalary;
        name = "dev";
        id = 7;

    }

    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
}
public class constructors {
    public static void main(String[] args){
//        MyMainEmployee harry = new MyMainEmployee("Ayush",12);
        MyMainEmployee harry = new MyMainEmployee(90000);
        //harry.setName("codewithharry");
        //harry.setId(34);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());

    }
}


