package tugas3;
import java.io.*;

public class PerbedaanWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Waktu pertama:");
        System.out.print("Jam: "); int h1 = Integer.parseInt(br.readLine());
        System.out.print("Menit: "); int m1 = Integer.parseInt(br.readLine());
        System.out.print("Detik: "); int s1 = Integer.parseInt(br.readLine());

        System.out.println("Waktu kedua:");
        System.out.print("Jam: "); int h2 = Integer.parseInt(br.readLine());
        System.out.print("Menit: "); int m2 = Integer.parseInt(br.readLine());
        System.out.print("Detik: "); int s2 = Integer.parseInt(br.readLine());

        int t1 = h1*3600 + m1*60 + s1;
        int t2 = h2*3600 + m2*60 + s2;

        int diff = Math.abs(t2 - t1);

        int dh = diff / 3600;
        diff %= 3600;
        int dm = diff / 60;
        int ds = diff % 60;

        System.out.printf("Selisih: %02d:%02d:%02d\n", dh, dm, ds);
    }
}
