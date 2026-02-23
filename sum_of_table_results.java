import java.util.Scanner;

public class sum_of_table_results {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A NUMBER: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i<=10; i++){
                // int mul = n*i;
               // System.out.printf("%d X %d = %d\n", n,i,n*i);
                sum = sum + n*i;

            }
        System.out.println("The sum of the results occuring in table of " + n + " will be : " + sum);

    }
    
}
