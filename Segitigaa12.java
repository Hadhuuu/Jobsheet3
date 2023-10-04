import java.util.Scanner;

/**
 * Segitigaa12
 */
public class Segitigaa12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        int alas, tinggi;
        float luas;
        
         System.out.println("Masukkan Alas: ");
         alas = scanner.nextInt();
         System.out.println("Masukkan Tinggi: ");
         tinggi = scanner.nextInt();
         luas = alas * tinggi / 2;
         System.out.println("Luas Segitiga: " + luas);
    }
}