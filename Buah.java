package tugas3;
import java.io.*;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli: ");
        int mangga = Integer.parseInt(br.readLine()); // contoh 70
        System.out.print("Jumlah tetangga: ");
        int tetangga = Integer.parseInt(br.readLine()); // contoh 4
        System.out.print("Jambu per tetangga: ");
        int jambuPer = Integer.parseInt(br.readLine()); // contoh 30
        System.out.print("Mangga busuk yang dikembalikan: ");
        int busuk = Integer.parseInt(br.readLine()); // contoh 15

        int totalJambu = tetangga * jambuPer;
        int totalBersih = mangga + totalJambu - busuk;

        System.out.println("Total jambu: " + totalJambu);
        System.out.println("Total buah setelah pengembalian: " + totalBersih);
    }
}
