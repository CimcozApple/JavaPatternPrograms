import java.util.Scanner;

public class Pattern07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

