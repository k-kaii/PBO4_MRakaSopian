package T8;
import java.util.Scanner;

class Number2 {
    int hitung(int a, int b) {
        int hasil = 1;
        for(int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan: ");
        int a = sc.nextInt();
        System.out.print("Pangkat: ");
        int b = sc.nextInt();

        Number2 p = new Number2();
        System.out.println("Hasil = " + p.hitung(a, b));
    }
}