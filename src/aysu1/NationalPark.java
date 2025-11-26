package aysu1;

import java.util.Scanner;

public class NationalPark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("National Parka Xosh Gelmisiniz");
        System.out.println("Xahish edirik hansi fealiyyetle meshgul olmaq istediyinizi bildirin");
        System.out.println("1-Hiking, 2-Camping, 3-Biking");

        int number = sc.nextInt();
        int endirim = 0;
        if(number==1){
        System.out.println("Hech bir endirim yoxdur.");}
        else if (number==2){
            System.out.println("Cadir levazimatlarin 15% endirim ");
            endirim = 15;
        }
        else if (number==3){
            System.out.println("Velosiped icarəsinə 25% endirim");
            endirim = 25;
        }
        else{
            System.out.println("Yanlishdir");
        }
        System.out.println("1 - Daga cixma");
        System.out.println("2  - Caya dushmek");
        System.out.println("3 - Velosiped Marşrutu");
        System.out.println("4 - Trekking Marşrutu");
        int istifadeci = sc.nextInt();
        switch (istifadeci) {
            case 1:
                System.out.println("Daga cixma");
                System.out.println("Cetinlik derecesi - Cetindir.");
                break;
            case 2:
                System.out.println("Caya dushmek");
                System.out.println("Cetinlik derecesi - Ortadir.");
                break;
            case 3:
                System.out.println("Velosiped Marşrutu");
                System.out.println("cetinlik derecesi - nisbeten cetindir.");
                break;
            case 4:
                System.out.println("Trekking Marşrutu");
                System.out.println("Cetinlik derecesi - Asandir.");
                break;
            default:
                System.out.println("Yanlish marshrut secimi");
                break;
        }




     }
}
