import java.util.Scanner;
public class tax_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        
    }
    
}
