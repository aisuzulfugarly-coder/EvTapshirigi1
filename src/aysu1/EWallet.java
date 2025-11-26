package aysu1;

import java.util.Scanner;

public class EWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cari balansinizi daxil edin");
        double balans = sc.nextDouble();

        System.out.println("Balansiniz" + balans );

        if (balans < 100){
        System.out.println("Banas ashagidir. Elave edin ve 5% bonuz qazanin");
    } else if (balans >=100 && balans <= 500) {
            System.out.println("Balans stabildir. Bütün əməliyyatlar sığortalanır");
        }
        else if (balans > 500){
            System.out.println("Siz VIP müştərisiniz! Bütün köçürmələr pulsuzdur");
        }
        System.out.println("Zehmet olmasa emeliyyat novunu secin");
        System.out.println("1- pul kocurme");
        System.out.println("2- Balans artirma");
        System.out.println("3- Hesab odenishi");
        System.out.println("4- Qizil alma");

        int seciminiz = sc.nextInt();
        switch (seciminiz){
            case 1:
                System.out.println("Kocurulecek meblegi daxil edin");
                double kocurme = sc.nextDouble();
                System.out.println("Siz" + kocurme +" Azn kocurme etdiniz");
                break;
            case 2:
                System.out.print("Artırılacaq məbləği daxil edin: ");
                double elave = sc.nextDouble();
                balans += elave;
                System.out.println("Yeni balansınız: " + balans + " AZN");
                break;
            case 3:
                System.out.print("Ödəniləcək məbləği daxil edin: ");
                double odenis = sc.nextDouble();
                System.out.println("Siz " + odenis + " AZN hesab ödənişi etdiniz.");
                break;
            case 4:
                System.out.print("Almaq istədiyiniz qızılın qiymətini daxil edin: ");
                double qizil = sc.nextDouble();
                System.out.println("Siz " + qizil + " AZN dəyərində qızıl aldınız.");
                break;
            default:
                System.out.println("Siz yanlish secim etmisiniz");
                System.out.println("Zehmet olmasa duzgun secimi daxil edin");
                break;
        }
            
        }
    }
