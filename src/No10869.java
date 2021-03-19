import java.util.Scanner;

public class No10869 {
    public static void main(String[] args) {
        int A, B;
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println((int)(A / B));
        System.out.println(A % B);
    }
}
