package aysu2;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        int pin = 1234;
        int say = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pin kodu daxil edin");
            int daxiledilen = sc.nextInt();

            if (daxiledilen == pin) {
                System.out.println("Siz sisteme daxil oldunuz");
                break;
            } else {
                say++;
                if (say < 3) {
                    System.out.println("Yanlish pin daxil etdiniz");

                    if (say == 3) {
                        System.out.println("Kartiniz bloklandi");
                        break;
                    }
                }
            }
        }
    }
}
