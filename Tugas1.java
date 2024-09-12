import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifPerKwh = 1500;
        System.out.print("Masukkan jumlah penggunaan listrik (kwh): ");
        double penggunaan = input.nextDouble();
        double totalTagihan = penggunaan * tarifPerKwh;
        boolean melebihiBbatas = penggunaan >= 500;
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan melebihi 500 kwh? " + melebihiBbatas);



    }
}