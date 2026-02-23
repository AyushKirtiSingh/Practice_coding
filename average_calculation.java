import java.util.Scanner;
public class average_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject1: ");
        float sub1 = sc.nextFloat();
        System.out.println("enter marks of subject2: ");
        float sub2 = sc.nextFloat();
        System.out.println("enter marks of subject3: ");
        float sub3 = sc.nextFloat();
        System.out.println("enter marks of subject4: ");
        float sub4 = sc.nextFloat();
        System.out.println("enter marks of subject5: ");
        float sub5 = sc.nextFloat();
        float percentage = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.print("The percentage of the student is: ");
        System.out.println(percentage);
    }
}
