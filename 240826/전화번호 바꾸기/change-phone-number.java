import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String[] arr = a.split("-");

        System.out.print(arr[0]+"-"+arr[2]+"-"+arr[1]);
        
    }
}