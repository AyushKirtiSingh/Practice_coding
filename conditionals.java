import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        age = sc.nextInt();            // note '=' is used for assignment and '==' is used for equality
        boolean cond = (age>=18);
        if(age>=18){
            System.out.println("yes boy you can drive!");
        }
        else{
            System.out.println("no boy you cannot drive yet!");   // note that the else block is optional
        }

    }
}

