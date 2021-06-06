public class Second_Largest_array_element {
    
    public static int getSecondLargest(int[]a,int total)
    {
        int temp;
        for(int i = 0; i<total; i++)
        {
            for(int j = i+1; j<total; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
    public static void main(String[] args) {
    
        int[] a = {1,3,5,6,7,9};
        int[] b = {11,33,55,88,22};

        System.out.print("Second Largst in A : " + getSecondLargest(a,6));
        System.out.println();
        System.out.print("Second Largst in B : " + getSecondLargest(b,5));
    }
}
