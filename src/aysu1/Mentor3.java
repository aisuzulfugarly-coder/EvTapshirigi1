package aysu1;

import java.util.Scanner;

public class Mentor3 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Uzunluğu daxil edin (sm): ");
            double uzunluq = sc.nextDouble();
            System.out.println("Eni daxil edin (sm): ");
            double en = sc.nextDouble();
            System.out.println("Hündürlüyü daxil edin (sm): ");
            double hundurluk = sc.nextDouble();
            double gonderis_hecmi = uzunluq * en * hundurluk;
            double hecm_cekisi = gonderis_hecmi / 6000;
            double yekun_qiymet = hecm_cekisi * 1.5;
            System.out.println("---- Hesablama Nəticəsi ----");
            System.out.println("Həcm (sm³): " + gonderis_hecmi);
            System.out.println("Həcm Çəkisi (kg): " + hecm_cekisi);
            System.out.println("Yekun Göndəriş Qiyməti: " + yekun_qiymet + " AZN");
        }


}
