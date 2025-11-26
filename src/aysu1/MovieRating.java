package aysu1;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Siz sevdiyiniz filme 1den 10a qeder nece point verirsiniz");
        int point = sc.nextInt();
        System.out.println("Siz sevdiyiniz filme" + point + " point verdiniz");

        if (point >= 1 && point <= 4){
            System.out.println("Çox pis qiymətləndirmə. Niyə belə bəyənmədiniz?");
        } else if (point >= 5 && point <= 7) {
            System.out.println("Orta qiymətləndirmə. Daha yaxşı filmlər tapaq!");
        } else if (point >= 8 && point <= 10) {
            System.out.println("Əla seçim! Bu filmi dostlarınıza tövsiyə etdiyinizə əmin olun.");
        } else
            System.out.println("Reytinq 1 ilə 10 arasında olmalıdır. Xahiş edirəm yenidən yoxlayın.");
    System.out.println("1 - Sci-Fi");
    System.out.println(" 2 - Drama");
    System.out.println("3 - Komediya");
    System.out.println("4 - Qorxu");

    int seciminiz = sc.nextInt();
    int secim = 0;
    switch (seciminiz){
        case 1:
            System.out.println("Siz Sci-Fi janrini secdiniz");
            System.out.println("Size secdiyiniz janra uygun Matrix filmini tovsiyye ede bilerem");
            break;
        case 2:
            System.out.println("Siz Drama janrini secdiniz");
            System.out.println("Size secdiyiniz janra uygun Titanic filmini tovsiyye ede bilerem");
            break;
        case 3:
            System.out.println("Siz Komediya janrini secdiniz");
            System.out.println("Size secdiyiniz janra uygun Jumanji filmini tovsiyye ede bilerem");
            break;
        case 4:
            System.out.println("Siz Qorxu janrini secdiniz");
            System.out.println("Size secdiyiniz janra uygun WolfMan filmini tovsiyye ede bilerem");
            break;
        default:
            System.out.println("Yanlish janr secimi");
            break;

    }
    }

}
