import java.util.Scanner;

public class ForKelipatan19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah, counter, total, totalKelipatan;
        jumlah = 0;
        counter = 0;
        total = 0;
        totalKelipatan = 0;

        System.out.print("Masukan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <=50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                totalKelipatan += i;
                counter++;
            }
        }
        double rataRata = (double) totalKelipatan / counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("Rata rata bilangan kelipatan adalah" + rataRata);

    }
}
