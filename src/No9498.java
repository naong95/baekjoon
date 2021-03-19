import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
        int score;
        String grade;
        Scanner scanner = new Scanner(System.in);

        score = scanner.nextInt();

        if(score > 89){
            grade = "A";
        }
        else if(score > 79){
            grade = "B";
        }
        else if(score > 69){
            grade = "C";
        }
        else if(score > 59){
            grade = "D";
        }
        else{
            grade = "F";
        }

        System.out.println(grade);
    }
}
