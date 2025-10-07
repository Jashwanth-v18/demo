public class patterns {
    public static void main(String[] args) 
    {
        int i,j,k;
        for (i=0;i<5;i++) 
        {
            for (j=0;j<=i;j++)
            {
                System.out.print("* ");
            }System.out.println();
        }
        
        for (i=1;i<=5;i++) 
        {
            for (j=0;j<5-i;j++)
            {
                System.out.print("  "); 
            }
            for (k=1;k<=2*i-1;k++)
            {
                if (k==1 || k%2==1)
                {

                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        for (i=1;i<=5;i++) 
        {
            for (j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<2*i-1;k++)
            if (k==1 || k%2==1)
            {
    
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
            
            System.out.println();
    }
    for (i=5;i>=1;i--)
    {
        for (j=1;j<=2*i-1;j++)
        {
            if (j==1 || j%2==1)
            {

                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for (i=5;i>=1;i--)
    {
        for (j=5;j>i;j--)
        {
            System.out.print("  ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            if (k%2==0)
            {

                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
}
    for (i=5;i>=1;i--)
    {
        for (j=5;j>i;j++)
        {
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            if (k%2==1)
            {

                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
}  
       for (i=1;i<=6;i++)
       {
            for (j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<=4;k++) {
                if (k%2==1)
                {
                    
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
        for (i=1;i<=4;i++)
        {
            for (j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++)
            if (k%2==1)
            {
                
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        for (i=3;i>=1;i--)
        {
            for (j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++)
            {
            if (k%2==1)
            {
                
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
                
                System.out.println();
    }
       for (i=0;i<4;i++)
       {
        for (j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        for (k=4;k>i;k--)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
       for (i=1;i<=3;i++)
       {
        for (j=3;j>i;j--)
        {
            System.out.print(" ");
        }
        for (k=0;k<=i;k++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
       for (i=0;i<5;i++)
       {
        for (j=0;j<5;j++) {
            if (i==0 || j==0 || i==4 || j==4) {

                System.out.print("* ");
            }
            else 
            {
                System.out.print("  ");
            }

        }
        System.out.println();
       }
       for (i=1;i<=5;i++)
       {
        for (j=0;j<5-i;j++)
        {
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            if (k==1 || k==2*i-1 || i==5 && k%2==1){

                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       for (i=5;i>=1;i--) 
       {
        for (j=5;j>i;j--) 
        {
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            if (i==5 && k%2==1 || k==1 || k==2*i-1)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }System.out.println();
       }
       for (i=1;i<=5;i++)
       {
        for (j=5;j>i;j--)
        {
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            if (k==1 || k==2*i-1)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       for (i=1;i<5;i++)
       {
        for (j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
        for (k=7;k>=2*i-1;k--)
        {
            if (k==7 || k==2*i-1)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       for (i=1;i<=5;i++)
       {
        for (j=5;j>i;j--)
        {
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            
                System.out.print("*");
           
        }
        System.out.println();
       }
       for (i=1;i<5;i++)
       {
        for (j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
        for (k=7;k>=2*i-1;k--)
        {
            
                System.out.print("*");
           
        }
        System.out.println();
       }
       int num = 1;
       for (i=1;i<5;i++)
       {
        for (j=1;j<=i;j++)
        {
                System.out.print(num + " ");
                num++;
            }
            
            System.out.println();
        }
       for (i=1;i<5;i++)
       {
        for (j=1;j<=i;j++)
        {
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
       for (i=1;i<5;i++)
       {
        for (j=1;j<=i;j++)
        {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        for (i=1;i<=4;i++)
        {
         int c = 1;
         for (k=4;k>=i;k--)
         {
            System.out.print(" ");
         }
        
            for (j=1;j<=i;j++)
            {
                System.out.print(c + " ");
                c = c * (i-j)/j;
            }System.out.println();
        }
       }

    }



