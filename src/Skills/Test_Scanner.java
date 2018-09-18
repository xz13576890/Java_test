package Skills;

import java.util.Scanner;

public class Test_Scanner {
    public static void inputStr() {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        while (nextLine != null && !nextLine.equals("")) {
            System.out.println(nextLine);
            nextLine = scanner.nextLine();
        }
    }

    public static void inputInt(){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int input = scanner.nextInt();
            System.out.println(input);
        }

    }


    public static void main(String[] args) {
        inputInt();
    }
}
