public class Narrowingg_typecasting_java_variable_example{
    public static void main(String[] args)
     {
        float f =  10.4f;

        //int a = f;   //compile time error

        int a = (int)f;

        System.out.println(f);
        System.out.println(a);
    }
}