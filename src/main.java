import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        int armutkg = inp.nextInt();

        System.out.println("Elma Kaç Kilo ? :");
        int elmakg = inp.nextInt();

        System.out.println("Domates Kaç Kilo ? :");
        int domateskg = inp.nextInt();

        System.out.println("Muz Kaç Kilo ? :");
        int muzkg = inp.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? :");
        int patlıcankg = inp.nextInt();

        double tutar = (armutkg*2.14) + (elmakg*3.67) + (domateskg*1.11) + (muzkg*0.95) + (patlıcankg*5.00);

        System.out.println("Toplam Tutar : "+tutar);
    }
}
