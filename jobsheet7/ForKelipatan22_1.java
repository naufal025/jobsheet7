package jobsheet7;
import java.util.Scanner;
public class ForKelipatan22_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double rataRata = 0.0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        if (counter > 0){
            rataRata = (double) jumlah / counter;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n" , kelipatan, counter);
        System.out.printf("Total bilangan keliapatan %d dari 1 sampai 50 adalah %d\n", kelipatan,jumlah);
        System.out.printf("Rata - rata dari kelipatan %d dari 1 samppai 50 adalah %.2f\n", kelipatan, rataRata);
        
    }
}
