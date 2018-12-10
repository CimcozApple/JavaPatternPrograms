import java.util.Scanner;

public class Pattern08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        char pr ='A';
        pr += num -1;
        for (int i = num-1; i >= 0; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print(pr);
            }
            pr --;
            System.out.println();
        }
    }
}

