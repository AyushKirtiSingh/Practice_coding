import com.sun.security.jgss.GSSUtil;
public class sort_check {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] array = {1,2,30,4,5,6};
        for (int i=0; i<array.length-1; i++){        // new type tricky good question
            if(array[i] > array[i+1]){
                isSorted = false;
                break;

            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
