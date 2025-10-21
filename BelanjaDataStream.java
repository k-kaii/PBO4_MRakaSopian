package tugas3;
import java.io.*;

public class BelanjaDataStream {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);

            System.out.print("Nama: ");
            String nama = dis.readLine(); // deprecated but digunakan untuk latihan

            System.out.print("Total Belanja (angka): ");
            double totalBelanja = Double.parseDouble(dis.readLine());

            System.out.print("Diskon (%) : ");
            double diskonPercent = Double.parseDouble(dis.readLine());

            double diskon = totalBelanja * diskonPercent / 100.0;
            double total = totalBelanja - diskon;

            System.out.print("Bayar: ");
            double bayar = Double.parseDouble(dis.readLine());
            double kembalian = bayar - total;

            // Tulis hasil ke file dengan DataOutputStream
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.dat"));
            dos.writeUTF("Nama: " + nama);
            dos.writeUTF(String.format("Total Belanja: %.2f", totalBelanja));
            dos.writeUTF(String.format("Diskon(%%): %.2f", diskonPercent));
            dos.writeUTF(String.format("Nominal Diskon: %.2f", diskon));
            dos.writeUTF(String.format("Total setelah diskon: %.2f", total));
            dos.writeUTF(String.format("Bayar: %.2f", bayar));
            dos.writeUTF(String.format("Kembalian: %.2f", kembalian));
            dos.close();

            System.out.println("\nRingkasan belanja telah disimpan ke file belanja.dat");
            System.out.printf("Total setelah diskon: %.2f\n", total);
            System.out.printf("Kembalian: %.2f\n", kembalian);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
