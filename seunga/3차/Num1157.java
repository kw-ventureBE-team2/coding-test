import java.util.Scanner;

public class Num1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        S = S.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int n = (int) c - 65;
            arr[n]++; //알파벳이 나오는 횟수 계산
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; //가장 많이 나오는 알파벳 찾기
            }
        }

        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[maxIndex]) {
                maxCount++; //가장 많이 나오는 알파벳이 몇개인지 찾기
            }
        }

        char result;
        if (maxCount > 1) {
            result = '?';
        } else {
            result = (char) (maxIndex + 65);
        }

        System.out.println(result);

        scanner.close();
    }
}
