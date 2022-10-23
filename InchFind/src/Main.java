import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of yards.");
        int numsYard = scan.nextInt();

        System.out.println("Enter number of Feet.");
        int numsFeet = scan.nextInt();

        System.out.println("Enter number of Inch.");
        int numsInch = scan.nextInt();

        int YardInch;
        YardInch = numsYard * 36;

        int FeetInch;
        FeetInch = numsFeet * 12;

        int TotalInch;
        TotalInch = YardInch + FeetInch + numsInch;

        System.out.println("The total number of inches is " + TotalInch);





    }
}
