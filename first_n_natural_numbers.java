import java.util.Scanner;
public class first_n_natural_numbers {
    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a natural number:");
        int n  = sc.nextInt();
        System.out.println("Using do while loop...");
        System.out.println("The first " + n + " natural numbers are given below");
        do{
            System.out.println(a);
            a++;
        }while(a<=n);

    }
    
}
