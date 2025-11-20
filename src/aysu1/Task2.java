package aysu1;

public class Task2 {
    public static void main(String[] args) {

        float productPrice = 3;
        int discount = 10;
        float finalPrice = productPrice - (productPrice * discount / 100);

        System.out.println("Original Price:" + productPrice);
        System.out.println("Discount:" + discount + "%");
        System.out.println("Final Price:" + finalPrice );
    }
}
