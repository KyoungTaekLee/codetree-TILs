import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [3];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        if ((arr[1] > arr[0]) && (arr[1] < arr[2])){
            System.out.print(1);
        }else {
            System.out.print(2);
        }
    }
}