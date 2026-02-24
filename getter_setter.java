class MyEmployee{
    private int id;
    private String name;
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
}

public class getter_setter {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
        //harry.name = "codewithharry"; --> Throws an error due to private access modifier
        harry.setName("codewithharry");
        System.out.println(harry.getName());
        harry.setId(456);
        System.out.println(harry.getId());



    }
}
