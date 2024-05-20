import java.util.Scanner;

public class Num2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // 위쪽 삼각형
        for (int i = 1; i <= num; i++) {
            // 공백 출력
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        // 아래쪽 삼각형
        for (int i = num - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }
}
