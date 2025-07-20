import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /**
         * Primitive Data Types and Their Ranges:
         *
         * byte    : 8-bit type   | Min value: -128          | Max value: 127
         * short   : 16-bit type  | Min value: -32,768       | Max value: 32,767
         * int     : 32-bit type  | Min value: -2,147,483,648| Max value: 2,147,483,647
         * long    : 64-bit type  | Min value: -9,223,372,036,854,775,808
         *                       | Max value: 9,223,372,036,854,775,807
         */

        System.out.print(" Enter len : ");
        double InputLen = scanner.nextDouble();

        System.out.println();
        System.out.print(" Enter width: ");
        double inputWidth = scanner.nextDouble();

        System.out.println();
        System.out.print("How many pices cut: ");
        int numberOfCUTs = scanner.nextInt();

        /**
         * Arithmetic Operators:
         *
         * Basic arithmetic operations that produce a result without modifying
         * the original values (unless using prefix/postfix operators).
         *
         * - Addition (+)
         * - Subtraction (-)
         * - Multiplication (*)
         * - Division (/)
         * - Modulus (%) — Returns the remainder of a division
         *
         * Prefix/Postfix Operators:
         * - Used to increase (++) or decrease (--) a value.
         * - These operators modify the original value.
         *   - Prefix: ++x / --x → modifies before use
         *   - Postfix: x++ / x-- → modifies after use
         */

        System.out.println();
        double area = InputLen * inputWidth;
        System.out.println(" Area of Plate : "+ area);

        System.out.println();
        System.out.print(  numberOfCUTs + " CUT " + " Enter Length CUT: ");
        double inputlenCut = scanner.nextDouble();

        if (inputlenCut >= InputLen)
        {
            System.out.println(" BAD Value FOR inputlenCut ");
        } else  {
            System.out.println(" GOOD Value FOR inputlenCut");
        }

        double TotalusedArea;
        TotalusedArea = inputlenCut * numberOfCUTs;
        System.out.println();
        System.out.println(" Total Good Size: " +  TotalusedArea);

        double totalRemainingArea;
        totalRemainingArea = InputLen - TotalusedArea;
        System.out.println();
        System.out.println(" Total Remaining  Size: " +  totalRemainingArea);


        /**
         * Compound Asssignment Operators
         * Combine an operation and assigment
         * Apply right side value to left side
         * Store result in variable on left side
         */
        int mvalue = 50;
        mvalue -= 5;
        //  System.out.println(mvalue);

        int othervalue = 100;

        int val1 = 5;
        int val2 = 10;

        othervalue /= val1 * val2;
        /**
         * In this case
         * Did 5 * 10
         * Then
         * 100 / 50
         * 2
         */
    }

}