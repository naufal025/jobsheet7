package jobsheet7;
import java.util.Scanner;
public class DoWhileCuti22_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan.next();

            if(konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else if (jatahCuti == 0) {
                    break;
                } else{
                    System.out.println("Sisa jatah cuti anda adalah " +jatahCuti+ " Harap isi dengan jatah cuti anda");
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
    
}
