import java.util.Scanner;

public class Num25206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalGrade = 0.0;
        int totalCredit = 0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();

            // 등급이 P가 아닌 경우에만 전공평점에 반영
            if (!grade.equals("P")) {
                totalGrade += getGradePoint(grade) * credit;
                totalCredit += credit;
            }
        }

        // 총 이수학점이 0이 아닌 경우에만 전공평점 계산
        double majorGPA = (totalCredit == 0) ? 0.0 : totalGrade / totalCredit;

        System.out.printf("%.6f", majorGPA);

        scanner.close();
    }

    // 등급을 과목평점으로 변환하는 메서드
    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0; // 등급이 P인 경우
        }
    }
}
