import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter n:");
        int n = a.nextInt();
        System.out.println("enter r ");
        int r = a.nextInt();
        int result = 0;
        float x;
        float y;
        for (int i = 0; i < n; i++) {
            System.out.println("enter x" + i);
            x = a.nextFloat();
            System.out.println("enter y" + i);
            y = a.nextFloat();
            if (x * x + y * y <= r) result++;
        }
        System.out.println("в окружность попало" + result + "точек/ки");


    }
} 
