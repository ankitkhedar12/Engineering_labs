public class Adding_Lower_Type {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

        //byte c = a+b;  //Compile Time Error:Because a+b will be int

        byte c= (byte)(a+b);

        System.out.println(c);
    }
}
