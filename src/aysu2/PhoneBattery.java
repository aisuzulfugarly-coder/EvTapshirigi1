package aysu2;

import java.util.Scanner;

public class PhoneBattery {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefonun hazırkı enerji səviyyəsini daxil edin: ");
        int energy = scanner.nextInt();

        int enegry = 100;

        while (enegry > 0);

        System.out.println("cari enerji seviyyesi" + enegry + "%");

        enegry -= 10;

        System.out.println("Telefon söndü. Zəhmət olmasa enerji yığın.");

    }
}
