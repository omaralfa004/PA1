import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of Inches:");
        int numInch = scan.nextInt();

        int Yard;
        Yard = numInch/36;

        int YardsInch;
        YardsInch = numInch % 36;

        int Feet;
        Feet = YardsInch/12;

        int FootInch;
        FootInch = YardsInch%12;




        System.out.println("Yards: " + Yard);
        System.out.println("Feet: " + Feet);
        System.out.println("Inches: " + FootInch);





    }
}
