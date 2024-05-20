import java.util.Scanner;

public class Num3003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] find=new int[6];
        int[] check= {1, 1, 2, 2, 2, 8};

        for(int i=0;i<6;i++){
            find[i]=scanner.nextInt();
            check[i]=check[i]-find[i];
        }

        for(int i=0;i<6;i++){
            System.out.print(check[i]+" ");
        }

        scanner.close();
    }
}
