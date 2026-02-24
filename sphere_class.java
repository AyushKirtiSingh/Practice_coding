class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4 * 3.142 * radius * radius;
    }

    public double volume(){
        return (4/3) * 3.142 * radius * radius * radius;
    }
}

public class sphere_class {

    public static void main(String[] args) {
        Sphere sph = new Sphere();
        sph.setRadius(5);
        System.out.println(sph.getRadius());
        System.out.println(sph.surfaceArea());
        System.out.println(sph.volume());



    }
}

