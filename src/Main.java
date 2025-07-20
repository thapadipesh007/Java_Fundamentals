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
        final int totalArea = (int) area;
        System.out.println(" Area: "+ totalArea);

        System.out.println();
        System.out.print(  numberOfCUTs + " CUT " + " Enter Length CUT: ");
        double inputlenCut = scanner.nextDouble();

        // Basic Conditional logic
        if (inputlenCut >= InputLen)
        {
            System.out.println(" BAD Value FOR Length CUT ");
        } else if (  inputlenCut < 0) {
            System.out.println(" BAD Value FOR Length CUT : No negative  value ");
        } else  {

            double TotalusedArea;
            TotalusedArea =  inputlenCut * numberOfCUTs;
            ///  Type Conversion
            int incomingTotalArea = (int) TotalusedArea;
            System.out.println();
            System.out.println(" Total Incoming Area, After : "  +  incomingTotalArea);

            double totalRemainingArea;
            totalRemainingArea = InputLen - incomingTotalArea;
            double currRemaingingArea = (double) totalRemainingArea;
            System.out.println();
            System.out.println(" After " +
                    numberOfCUTs + " CUT " + "  Length CUT OF  " +   inputlenCut
                    + " **Total  Remaining  Area** =  " + currRemaingingArea);
        }
        /**
         * Compound Assignment Operators
         * - Combine an operation with assignment
         * - Apply the right-side value to the left-side variable
         * - Store the result in the variable on the left side
         */

/**
 * Conditional Logic
 * - Perform a test that results in true or false
 * - Execute actions based on the test result
 *
 * Comparison Operators:
 * - Greater than: >
 * - Greater than or equal to: >=
 * - Less than: <
 * - Less than or equal to: <=
 * - Equal to: ==
 * - Not equal to: !=
 *
 * Ternary Operator:
 * - condition ? trueValue : falseValue
 *
 * Logical Operators:
 * - AND: &  (true & true)
 * - OR: |  (false | true, true | false, true | true)
 * - Exclusive OR (XOR): ^  (false ^ true, true ^ false)
 * - Negation: !  (!false = true)
 */

    }

}