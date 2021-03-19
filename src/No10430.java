import java.util.Scanner;

public class No10430 {
    public static void main(String[] args) {
        int A, B, C;

        Scanner scanner = new Scanner((System.in));

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
