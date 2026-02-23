import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n = sc.nextInt();
        int factorial = 1;
        int i = n;
        while(i>=1){
            factorial *= i;
            i--;
        }
        System.out.println("THE FACTORIAL OF " + n + " is: " +  factorial);

    }
}
