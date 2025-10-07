public class arrays {
    //1D array
    public static void main(String[] args) {
    int arr[] = new int[5];
    for (int i = 0;i<5;i++)
    {
        arr[i] = (int)(Math.random() * 10);  /* "*" by 10 converts the point decimal number which is created by Math.random() into a single
                                             digit float and the int is to convert this float into an integer (Explicit or casting type) */
        System.out.print(arr[i]+" ");
    } 
    System.out.println();
    //2D array
    int arr1[][] = new int[5][5];
    for (int j=0;j<5;j++)                 //j represents rows and k represents columns
    {
        for (int k=0;k<5;k++)
        {
            arr1[j][k] = (int)(Math.random()*10);
            System.out.print(arr1[j][k] + " ");
        }System.out.println();
    }
    //Jagged array
    int arr2[][] = new int[5][];
    arr2[0] = new int[6];
    arr2[1] = new int[5];
    arr2[2] = new int[7];
    arr2[3] = new int[4];
    arr2[4] = new int[3];

    for (int m=0;m<arr2.length;m++)                 
    {
        for (int n=0;n<arr2[m].length;n++)
        {
            arr2[m][n] = (int)(Math.random() * 10);
            System.out.print(arr2[m][n] + " ");
        }System.out.println();
    }
}
}
