import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int year = a.nextInt();
        if (year > 2022) {
            System.out.println("error");
            return;
        }
        Scanner b = new Scanner(System.in);
        System.out.println("Введите месяц рождения: ");
        int month = b.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("error");
            return;
        }
        Scanner c = new Scanner(System.in);
        System.out.println("Введите день рождения: ");
        int day = c.nextInt();
        if (day < 1 || day > 31){
            System.out.println("error");
            return;
        }
        System.out.println("your age is ");
        System.out.println(2022-year);
        System.out.println("лет");
        System.out.println(12-month);
        System.out.println("месяцев");
        System.out.println(31-day);
        System.out.println("дней");


    }
}
