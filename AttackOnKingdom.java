import java.util.Arrays;
import java.util.Scanner;

public class AttackOnKingdom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-->0){
            int totalDays = scanner.nextInt();
            int temperatureOfDays[] = new int[totalDays];

            for (int i = 0; i < temperatureOfDays.length; i++) {
                temperatureOfDays[i] = scanner.nextInt();
            }

            Arrays.sort(temperatureOfDays);

            System.out.println(temperatureOfDays[1]);
        }
    }
}
