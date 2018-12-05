package multidimenstionalArray;

/** Create By Sylwester Garstecki */
public class Main {
    public static void main(String[] args) {
        /** Create multidimenstional array */
        int[][] table = new int[6][3];

        /** Asigning values in the array (1,2,3,4,5,6)*/
        for (int a = 0; a<table.length; a++) {
            table[a][0] = a + 1;
            table[a][1] = a + 1;
            table[a][2] = a + 1;
        }

        /** Displaying the contents of the table */
        for (int i = 0; i<table.length; i++){
            for (int j= 0; j<table[i].length; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
