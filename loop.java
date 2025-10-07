public class loop {
    public static void main(String[] args) 
    {
        int i = 1;
        while (i<=17)
        {
            System.out.println("Virat");
            i++;
        } 
        System.out.println(i);
        int j = 1;
        for ( j = 1; j<=17;j++) {
            System.out.println("Kohli");
        }System.out.println(j);
        int k =1 ;
        do {
            System.out.println(k);   /*do...while... is simply used to print or execute the statement atleast one time
             even the condition is not true */
            k++;
        }while(k<0);
        //Nested for loop
        String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for ( i = 0;i<7;i++) {
            System.out.println(arr[i]);
            for (j=1;j<=24;j++) 
            {
                System.out.println("   "+ j);
            }
        }
    }
}
