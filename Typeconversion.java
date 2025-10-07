public class Typeconversion 
{
    public static void main(String[] args) 
    {
        //implicit or type coercion 
        byte a = 10;
        int b = 127;
        int c = 120;
        c = a;//We can store a byte in an integer
        System.out.println(c);
        //If we want to store an integer in a byte then explicit convertion or casting is required
        a = (byte)b;   //Here the condition is the integer should be within the range the byte
        System.out.println(a);
        /*If you try to store an int in byte then the operation is performed as num % 256,here 256 is the total values of a byte
        which ranges from -128 t0 127, it tries to convert the given value (here x=257) within the range -128 to 127 */
        int x = 257;
        byte y = (byte) x;
        System.out.println(y);
        //We can also convert a double into an int using this explicit type
        double d = 12.22;
        int e = (int) d;
        System.out.println(e);
        float f = 22.2f;
        int i = (int)f;
        System.out.println(i);
        //But we can store an int in float
        int l = 12;  
        float k = l;
        System.out.println(k); //This is an implicit type
        int g = 'a';
        System.out.println(g);
        //int m = 12.0f;   It gives an error
        /*In c we can store a float in an int and double in an int without explicit conv., the only explicit conv. 
        we need is to do an opertion between two integer and storing in an float (float a = (float) 5/2;) gives 2.50, 
        without explicit conv. (float a = 5/2;) gives 2.00 */
        //We conclude that in java, if any promotion is done then explicit conv. is required example: (float to int,double to int)
    }
}
