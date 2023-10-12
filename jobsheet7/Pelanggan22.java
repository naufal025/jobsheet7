package jobsheet7;
import java.util.Scanner;
public class Pelanggan22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc22.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelanggan baru (Y/T)? ");
            jawab = sc22.nextLine().charAt(0);
        } while (jawab == 'Y' || jawab == 'y');
        System.out.println("Jumlah pelanggan yang anda masukkan = " + jml);

    }
}
