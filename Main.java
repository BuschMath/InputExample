import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner inConsole = new Scanner(System.in);
        System.out.print("What is your favorate number?: ");
        int fNum = inConsole.nextInt();
        System.out.println("So your favorate number is: " + fNum);

        inConsole.close();

        Scanner inFile = new Scanner(Paths.get("input.txt"), "UTF-8");
        int ffNum = inFile.nextInt();
        System.out.println("The file's favorate number is: " + ffNum);

        inFile.close();
    }
}