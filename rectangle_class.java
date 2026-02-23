class Rectangle{
    int length;
    int breadth;

    public int length(){
        return length;
    }

    public int breadth(){
        return breadth;
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * (length + breadth);
    }
}

public class rectangle_class {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 6;
        System.out.println("THE LENGTH OF RECTANGLE IS " + rec.length());
        System.out.println("THE BREADTH OF RECTANGLE IS " + rec.breadth());
        System.out.println("THE AREA OF RECTANGLE IS " + rec.area());
        System.out.println("THE PERIMETER OF RECTANGLE IS " + rec.perimeter());
    }
}        