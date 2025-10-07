
    class Student
{
    /*We cannot pass a string as arguments, so there is no use in creating a method.Therefore we are declaring the variables 
      and assinging in main method */
    int roll;
    String name;
    int rank;
}
public class Classarray
 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 18;
        s1.name = "Jash";
        s1.rank = 1;

        Student s2 = new Student();
        s2.roll = 17;
        s2.name = "ABD";
        s2.rank = 2;

        Student arr[] = new Student[2];   //Declaring array of a student type so that i can store a string value
        arr[0] = s1;
        arr[1] = s2;
        for(int i=0;i<arr.length;i++) 
        {
            System.out.println(arr[i].name + ":" + arr[i].rank);

        }
        //enhanced loop
        for (Student n : arr)
        {
            System.out.println(n.name + ":" + n.rank);
        }

    }
}

