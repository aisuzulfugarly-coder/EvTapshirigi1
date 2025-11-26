package aysu2;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kuriyer catdirilma xidmetine xosh gelmisiz ");
        int catdirilma = 0;

        System.out.print("Sifariş məbləğini daxil edin: ");
        double sifarisMeblegi = sc.nextDouble();

        System.out.println("1 - Baku, 2 - Sumqayit, 3 - Xirdalan ");
        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Baku");
                System.out.println("Catdirilma qiymeti 5 Azn");
                catdirilma = 5;
                break;
            case 2:
                System.out.println("Sumqayit");
                System.out.println("Catdirilma qiymeti 7 Azn");
                catdirilma = 7;
                break;
            case 3 :
                System.out.println("Xirdalan");
                System.out.println("Catdirilma qiymeti 6 Azn");
                catdirilma = 6;
                break;
            default:
                System.out.println("Xidmet movcud deyil");


        }

        if (sifarisMeblegi > 50){
            System.out.println("Catdirilma pulsuzdur");
            System.out.println("Yekun mebleg" + (sifarisMeblegi));
        }
        else {
            System.out.println("Yekun mebleg" + (sifarisMeblegi + catdirilma));

        }



    }
}

