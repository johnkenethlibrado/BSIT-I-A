import java.util.Scanner;
public class ORTEGA_ACTIVITY_II {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int variable;
        System.out.print("Enter the first value: ");
        int fnum = sc.nextInt();
        System.out.print("Enter the second value: ");
        int snum = sc.nextInt();

        System.out.println("Sum = "+(fnum + snum));
        System.out.println("Difference = "+(fnum - snum));
        System.out.println("Product = "+(fnum * snum));
    }
}
