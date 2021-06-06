public class Int_to_String {
    public static void main(String[] args) {
        int i = 200;
        String s = String.valueOf(i);      //Method 1
        //String s = Integer.toString(i);   //Method 2

        //String s = String.format("%d",i);  //Method 3

        System.out.println(i+100);  //300 because + is binary operator
        System.out.println(s+100);  //200100 because + is string concatenation operator
    }
}
