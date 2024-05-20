import java.util.Scanner;

public class Num2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String S = scanner.next();
        int count = 0;

        // 크로아티아 알파벳을 모두 치환
        for (String c : croatia) {
            if (S.contains(c)) {
                S = S.replaceAll(c, " ");
            }
        }

        // 치환된 문자열의 길이가 총 알파벳 개수
        count = S.length();

        System.out.println(count);

        scanner.close();
    }
}
