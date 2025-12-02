package aysu1;

public class Mentro5 {
    public static void main(String[] args) {
        double[] temperatur = {20.5, 22.1, 19.0, 24.6, 18.3, 21, 25};
        double sum = 0;
        double max = temperatur[0];
        for (double reqemler : temperatur) {
            sum += reqemler;

            if (reqemler > max) max = reqemler;
        }
        double average = sum / temperatur.length;
        System.out.println("Həftəlik orta temperatur: " + average);
        System.out.println("Maximum tempuratur : " + max);
    }
}
