package readOfFile;
/** Crate By Sylwester Garstecki */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        /** Assign the Scanner */
        Scanner scanner = new Scanner(new File("C:\\Users\\sylwe\\Desktop\\ToDo.txt"));
        /** Display scanner value */
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
