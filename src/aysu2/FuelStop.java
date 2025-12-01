package aysu2;

import java.util.Scanner;

public class FuelStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuel = 20;
        while (true) {
            System.out.println("Hazirki yanacaq səviyyəsi: " + fuel);

            System.out.print("Neçə litr yanacaq əlavə edirsiniz? ");
            int addFuel = sc.nextInt();

            fuel += addFuel;

            if (fuel >= 80) {
                System.out.println("Yanacaq hədəfə çatdı. Səfərə davam!");
                break;
            }
            System.out.println("Yanacaq yenə də azdır. Növbəti məntəqəyə gedirik...");

        }

    }
    }

