import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        int A, B, a, b, c;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        a = B % 10;
        b = (B / 10) % 10;
        c = B / 100;

        System.out.println(A * a);
        System.out.println(A * b);
        System.out.println(A * c);
        System.out.println(A * B);
    }
}
