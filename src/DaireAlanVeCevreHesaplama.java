import java.util.Scanner;


public class DaireAlanVeCevreHesaplama {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz:");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz:");
        a = input.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double dilimAlani = (pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı:" + alan);
        System.out.println("Dairenin çevresi:" + cevre);
        System.out.println("Daire diliminin alanı:" + dilimAlani);
    }
}
