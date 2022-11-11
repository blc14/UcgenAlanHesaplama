import java.util.Scanner;
public class UvgenAlan {
    public static void main(String[] args) {
    int kenara, kenarb, kenarc, cevre;
    double alan;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kenar A: ");
        kenara= scan.nextInt();

        System.out.print("Kenar B: ");
        kenarb= scan.nextInt();

        System.out.print("Kenar C: ");
        kenarc= scan.nextInt();

        cevre = kenara + kenarb + kenarc ;
        int u = cevre/2;
        alan =Math.sqrt(u*(u-kenara)*(u-kenarb)*(u-kenarc));

        System.out.println("Üçgenin Alanı: "+alan);


    }
    }
