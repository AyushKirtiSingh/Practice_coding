class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class tommy_class {
    public static void main(String[] args) {
        Tommy tom = new Tommy();
        tom.hit();
        tom.run();
        tom.fire();
    }
    
}
