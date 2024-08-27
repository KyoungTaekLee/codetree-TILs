import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int humanOneAge = sc.nextInt();
        String humanOneSex = sc.next();
        
        int humanTwoAge = sc.nextInt();
        String humanTwoSex = sc.next();

        if( (humanOneAge >= 19 && humanOneSex == "M") || (humanTwoAge >= 19 && humanTwoSex == "M") ){
            System.out.print(1);
        }else {
            System.out.print(0);
        }
    }
}