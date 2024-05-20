import java.util.Scanner;

public class Num2675 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCase=scanner.nextInt();
        for(int i=0;i<testCase;i++)
        {
            int repeatN=scanner.nextInt();
            String repeatS=scanner.next();

            for(int j=0;j<repeatS.length();j++){
                char c=repeatS.charAt(j); //해당 문자열의 배열 숫자에 위치한 것을 가져옴

                for(int k=0;k<repeatN;k++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    scanner.close();
    }
}
