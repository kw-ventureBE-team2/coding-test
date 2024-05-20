import java.util.Scanner;

public class Num1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int words = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < words; i++) {
            String S = scanner.next(); // 개행 문자 이전의 단어를 읽음
            if (isGroupWord(S)) {
                count++;
            }
            // 개행 문자 소비
            scanner.nextLine();
        }


        System.out.println(count);

        scanner.close();
    }

    // 그룹 단어 여부를 판별하는 메서드
    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳의 방문 여부를 체크하기 위한 배열
        char prev = word.charAt(0); // 이전 문자를 저장하는 변수
        visited[prev - 'a'] = true; // 첫 문자를 방문 처리

        // 두 번째 문자부터 순회하면서 그룹 단어 여부를 체크
        for (int i = 1; i < word.length(); i++) {
            char current = word.charAt(i); // 현재 문자
            if (prev != current) { // 이전 문자와 다르면
                if (visited[current - 'a']) { // 현재 문자가 이미 방문한 문자라면
                    return false; // 그룹 단어가 아님
                }
                visited[current - 'a'] = true; // 아니면 방문 처리
            }
            prev = current; // 이전 문자 갱신
        }
        return true; // 모든 문자가 그룹 단어인 경우
    }
}
