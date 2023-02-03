import java.util.Scanner;

public class ThreeNumberExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-->0){
            long a  = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            if(a+b==c || b+c==a || a+c==b){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
