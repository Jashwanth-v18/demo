public class Switchcase {
    public static void main(String[] args)
    {
        char grade = 'A';
        switch (grade) {
            case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            System.out.println("Good");
            break;
            case 'C':
            System.out.println("Work Hard");
            break;
            case 'D':
            System.out.println("Just Pass");
            break;
            default :
            System.out.println("Fail");
            break;
        }
    }
}
