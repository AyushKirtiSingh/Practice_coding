import java.util.Scanner;
public class website_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL:");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(url.endsWith(".in")){
            System.out.println("This is an indian website");
        }



    }
}

        
    
