package tugas3;
import java.io.*;

public class GayaSentripetal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan massa (kg): ");
        double m = Double.parseDouble(br.readLine());
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = Double.parseDouble(br.readLine());
        System.out.print("Masukkan jari-jari (m): ");
        double r = Double.parseDouble(br.readLine());

        double Fc = m * v * v / r;
        System.out.printf("Gaya sentripetal Fc = %.4f N\n", Fc);
    }
}

