import java.util.Scanner;
import java.util.StringTokenizer;

public class Num1152
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine(); //개행을 기준으로 문자열 구분
        StringTokenizer stk=new StringTokenizer(S," ");
        int count=0;
        while(stk.hasMoreTokens()){
            stk.nextToken();    //다음 토큰으로 넘어가줘야 함.
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
