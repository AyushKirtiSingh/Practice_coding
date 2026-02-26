public class fibonacciseries {
    static int fibonacci(int n){
        if(n==1 || n==2){
            return (n-1);
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
        int result = fibonacci(i);
        System.out.println(result);}

    }
}
