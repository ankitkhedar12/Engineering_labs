public class String_to_Int {
    public static void main(String[] args) {
        String s = "200";
        
        Integer i = Integer.valueOf(s);      //Method 1
        //int i = Integer.parseInt(s);      //Method 2

        System.out.println(s+100);  //200100 because "200"+100 is a string concatenation operator
        System.out.println(i+100);   //300 bcz 200+100 , here + is binary operator
    }
}
