public class increments {
    public static void main(String[] ars) 
    {
        int n = 5;

        //post increment
        int x = n++;  //It will first assigns the value 5 to the variable x and then incremented to 6
        System.out.println(x);

        // pre increment
        int y = ++n; /*As the incremented value in the above expression is 6, this expression will first increments the value
                       as 7 and then assings to the variable y */
        System.out.println(y);

        //post decrement 
        int a = n--; //As post incr. post decr. also first assings the value 7 to the variable a and then decrements to 6
        System.out.println(a);
        
        int b = --n; //As pre incr. pre decr. also first decrements the value 6 into 5 and then assings to the variable b
        System.out.println(b);
    }
}
