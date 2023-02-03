import java.util.*;

public class FindInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0){
            int n = scan.nextInt();

            n++;

            while(!satisfy(String.valueOf(n))){
                n++;
            }

            System.out.println(n);
        }
    }

    private static boolean satisfy(String n) {
        HashSet s = new HashSet();

        for(int i=0;i<n.length();i++){
            if(s.contains(n.charAt(i))){
                return false;
            }else {
                s.add(n.charAt(i));
            }
        }
        return true;
    }
}