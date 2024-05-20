import java.util.Scanner;

public class Num10988 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String S=scanner.next();
        System.out.println(pallendrom(S));

        scanner.close();
    }

    public static int pallendrom(String S){
        int length = S.length();
        for(int i = 0; i < length / 2; i++){
            if(S.charAt(i) != S.charAt(length - 1 - i)){ // 오른쪽 끝의 문자는 length - 1 - i 에 위치
                return 0;
            }
        }
        return 1;
    }

}
