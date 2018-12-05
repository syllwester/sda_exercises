package programming1exercises.exercises001.exercise1and2;


import java.util.Scanner;

public class MethodsGetSumMaxMin {

    public void sumMinMax() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerEnd = new Scanner(System.in);
        int sumNum = 0;
        int max = 0;
        int min;
        int end;
        int num = 0;
        System.out.println("How many numbers you want enter?");
        end = scannerEnd.nextInt();
        System.out.println("Enter the numbers: ");
        num = scanner.nextInt();
        min = num;
        for(int i = 1; i < end; i++) {
            num = scanner.nextInt();
            sumNum = sumNum + num;
            max = Math.max(num, max);
            min = Math.min(num, min);
        }


        System.out.println("Suma: " + sumNum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
