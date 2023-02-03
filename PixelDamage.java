import java.util.Scanner;

public class PixelDamage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            long h = sc.nextLong();
            long w = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            double ans = Math.sqrt(((w-x)*(w-x))+((h-y)*(h-y)));

            if(ans<k){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
