class add 
{
    int add1(int a,int b)    //Here add1 is the method 
    {
        int c = a + b;
        return c;
    }
}



public class Classobj {
    public static void main(String[] args) 
    {
      int num1 = 5;
      int num2 = 3;
      add obj = new add();     /*declaration of the object "obj", here "new" is the keyword used to allocate the memory for the
                                object and add() is to access the constructor of the class "add". obj is simply r a reference 
                                varible and add is like a data type to declare the object "obj",which means it belongs to the class "add" */
      int result = obj.add1(num1,num2);     /*calling the method in the main function using the object by passing the valuse as arguments 
                                            to the parameters a and b, and storing the integer value returned in the result */
      System.out.println(result);

    }
}
