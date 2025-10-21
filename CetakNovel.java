package tugas3;
import java.io.*;

public class CetakNovel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah novel: ");
        int jumlahNovel = Integer.parseInt(br.readLine());
        System.out.print("Lembar per novel: ");
        int lembarPer = Integer.parseInt(br.readLine());

        long totalLembar = (long) jumlahNovel * lembarPer;
        long totalDetik = totalLembar; // 1 lembar = 1 detik

        long hari = totalDetik / 86400;
        totalDetik %= 86400;
        long jam = totalDetik / 3600;
        totalDetik %= 3600;
        long menit = totalDetik / 60;
        long detik = totalDetik % 60;

        System.out.println("Waktu yang diperlukan:");
        System.out.printf("%d hari, %d jam, %d menit, %d detik\n", hari, jam, menit, detik);
    }
}
