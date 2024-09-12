import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double presentaseBonus = 0.10, presentasePajak = 0.05;
        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        double jamKerja = sc.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double gajiBersih = jamKerja * upahPerJam;
        double bonus = gajiBersih * presentaseBonus;
        double totalSebelumPajak = gajiBersih * bonus;
        double pajak = totalSebelumPajak * presentasePajak;
        double totalGajiSetelahPajak = totalSebelumPajak - pajak;
        
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Total gaji setelah pajak: Rp " + totalGajiSetelahPajak);

    }
}