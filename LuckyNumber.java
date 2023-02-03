import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            int x = 0;
            while(n%2==0){
                n/=2;
                x++;
            }
            if(x%2==0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
