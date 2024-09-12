import java.util.Scanner;

public class SIAKAD09 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nama, nim;
            char kelas;
            byte absen;
            double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextLine();
            System.out.print("Masukkan kelas: ");
            kelas = sc.nextLine().charAt(0);
            System.out.print("Masukkan nomor absen: ");
            absen = sc.nextByte();
            System.out.print("Masukkan nilai kuis (20%): ");
            nilaiKuis = sc.nextDouble();
            System.out.print("Masukkan nilai tugas (15%): ");
            nilaiTugas = sc.nextDouble();
            System.out.print("Masukkan nilai UTS (30%):");
            nilaiUTS = sc.nextDouble();
            System.out.print("Masukkan nilai UAS (35%):");
            nilaiUAS = sc.nextDouble();

            nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
            System.out.println("Nama: "+ nama);
            System.out.println("NIM: " + nim);
            System.out.println("Kelas " + kelas);
            System.out.println("Absen: " + absen);
            System.out.println("Nilai Akhir: "+ nilaiAkhir);

        
    }
}
