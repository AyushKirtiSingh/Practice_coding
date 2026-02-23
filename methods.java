public class methods {
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro");
        System.out.println("Good morning " + b + " bro");

    }

    static int foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro");
        System.out.println("Good morning " + b + " bro");     // This will not be aacepted as another method because we cannot make only by changing the return type of methods like void to int.
        return 3;

    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro");
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void change1(int [] arr){
        arr[0] = 98;
    }
    static void change(int a){
        a = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
        // telljoke();

        // Case 1: Changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        //int [] marks = {65,76,89,56,78};
        //change1(marks);
        //System.out.println("The value of x after running change is: " + marks[0]);


        //Method Overloading
        foo();
        foo(3000);
        foo(3090,4000);  // Arguments are actual values!



    }
}


    