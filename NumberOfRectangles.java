import java.util.Scanner;

public class NumberOfRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-->0){
            long n = scanner.nextInt();
            long m = scanner.nextInt();

            long ans = (long)((m*(m+1)*n*(n+1)/4)-(n*m));

            System.out.println(ans);
        }
    }
}
