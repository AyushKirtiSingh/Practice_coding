import java.util.Scanner;

public class sum_of_firstn_even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int sum = 0;
        int n = sc.nextInt();
        for(int i=0; i<=n; i++ ){
            System.out.println(2*i);
            sum = sum + 2*i;
        }
        System.out.println("THE SUM OF FIRST " + n + " EVEN NATURAL NUMBERS IS:" + sum);

    }
    
}
