package tugas3;

import java.io.*;
import java.util.Scanner;

public class ScannerVsBufferedReader {
    public static void main(String[] args) throws Exception {
        // Scanner example
        Scanner sc = new Scanner(System.in);
        System.out.print("Scanner - Masukkan sebuah angka: ");
        int x = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Anda memasukkan (Scanner): " + x);

        // BufferedReader example
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("BufferedReader - Masukkan sebuah angka: ");
        String s = br.readLine();
        int y = Integer.parseInt(s);
        System.out.println("Anda memasukkan (BufferedReader): " + y);
    }
}
