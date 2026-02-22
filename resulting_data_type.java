public class resulting_data_type {
    public static void main(String[] args) {
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.4f + x;
        System.out.println(b); */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++;  // first b is assigned i (56) and then i is incremented
        int j = 67;
        // int c = ++j; // first j is incremented and then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // Quick quiz
        int m = 68;
        int n = ++m;
        int o = --m;
        System.out.println(n);
        System.out.println(o);
        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);

    }
}
