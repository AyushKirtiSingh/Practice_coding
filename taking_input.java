import java.util.Scanner;;

public class taking_input {

    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1: ");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        System.out.println("enter number2: ");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a + b;
//        float sum = a + b;
//        System.out.println("the sum of these two numbers is: ");
//        System.out.println(sum);
        String str = sc.nextLine();
        System.out.println(str);
    }
}