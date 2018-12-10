import java.util.Scanner;

public class Pattern05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            char pr ='A';
            for (int j = 1; j <= num; j++) {
                System.out.print(pr);
                pr++;
            }
            System.out.println();
        }
    }
}

