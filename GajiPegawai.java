package tugas3;
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan (NIK): ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        String jabatan = "Manajer";
        double gajiPokok = 7000000;
        double tunjanganJabatan = 250000;
        double tunjanganIstri = 150000;
        double tunjanganAnak = 100000;

        double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n===== DATA GAJI PEGAWAI =====");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Jabatan        : " + jabatan);
        System.out.println("Total Gaji     : Rp" + totalGaji);
        System.out.println("Pajak (10%)    : Rp" + pajak);
        System.out.println("Gaji Bersih    : Rp" + gajiBersih);
    }
}