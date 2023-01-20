import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stepik {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
