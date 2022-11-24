
import java.util.Random;
import java.util.Scanner;

public class Program {


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
        System.out.print("Ваш возраст: ");
        System.out.print(2022-year );
        System.out.print(" лет ");
        System.out.print(11-month );
        System.out.print(" месяцев/ца ");
        System.out.print(24-day );
        System.out.println(" дней");

    }
}
