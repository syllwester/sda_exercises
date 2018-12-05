package checkTheArmsOfTheTriangle;
/** Create by Sylwester Garstecki */

import java.util.Scanner;

/** The user gives 3 numerical values of type int.
 *Check if the given value can be the triangle arms.
 */
public class CheckArms {
    public void checkArms() {
        /** Create variable the scanner */
        Scanner scanner = new Scanner(System.in);

        /** Assign the value to scanner */
        System.out.println("Program sprawdza czy podane wartości mogą stworzyć trójkąt.");
        System.out.println("Podaj wartości: ");
        System.out.println("A = ");
        int a = scanner.nextInt();
        System.out.println("B = ");
        int b = scanner.nextInt();
        System.out.println("C = ");
        int c = scanner.nextInt();

        /** Conditional instruction */
        if (a < b+c && b < c+a && c < a+b){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
        scanner.close();
    }
}
