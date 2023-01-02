import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inConsole = new Scanner(System.in);
        System.out.print("What is your favorate number?: ");
        int fNum = inConsole.nextInt();
        System.out.println("So your favorate number is: " + fNum);

        inConsole.close();
    }
}