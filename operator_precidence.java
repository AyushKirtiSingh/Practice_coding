public class operator_precidence {
    public static void main(String[] args) {
        int x = 6;
        int y = 1;
        int k = x*y/2;
        System.out.println(k);

        int a = 2;
        int b = 4;
        int c = 1;
        int d = 3;
        int l = b*b - (4*a*c)/(2*a);  // Highest precedence is of paranthesis
        int j = a*b-d;
        System.out.println(l);
        System.out.println(j);
    }

    
}