package jobsheet7;
import java.util.Scanner;
public class ForVar222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;
        boolean berhenti = false;
        for (; !berhenti;){
            System.out.print("Masukkkan bilangan: ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang anda masukkan: " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
        System.out.println("Program Berakhir");
    }
}
