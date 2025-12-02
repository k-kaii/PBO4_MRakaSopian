package T8;
import java.util.Scanner;

class Number1 {
    int hitung(int n) {
        int hasil = 1;
        for(int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        Number1 f = new Number1();
        System.out.println("Faktorial = " + f.hitung(n));
    }
}
