import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        year = scanner.nextInt();

        int four,hund, fourHund;
        
        four = year % 4;
        hund = year % 100;
        fourHund = year % 400;

        if(four == 0 && hund != 0){
            System.out.println(1);
        }
        else if(fourHund == 0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
