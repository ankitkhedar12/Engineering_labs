import java.util.Arrays;
public class Returning_array_from_method {
    public static void main(String[] args) {
        int[] a = numbers();
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

    }
    public static int[] numbers()
    {
        int[] arr = {5,6,7,8,9};
        return arr;
        
    }
}
