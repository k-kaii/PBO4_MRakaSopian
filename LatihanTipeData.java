public class LatihanTipeData {

    public static void main(String[] args) {
        System.out.println("=== 1. Operator Increment ===");
        soal1();

        System.out.println("\n=== 2. Luas Persegi Panjang ===");
        soal2();

        System.out.println("\n=== 3. Persamaan Kuadrat ===");
        soal3();

        System.out.println("\n=== 4. Operasi Matematika ===");
        soal4();

        System.out.println("\n=== 5. Luas Segitiga ===");
        soal5();

        System.out.println("\n=== 6. Sisi Miring & Keliling Segitiga ===");
        soal6();

        System.out.println("\n=== 7. Ubah String ===");
        soal7();

        System.out.println("\n=== 8. Kecepatan Cahaya ===");
        soal8();

        System.out.println("\n=== 9. Konversi Suhu ===");
        soal9();
    }

    // 1. Operator Increment
    public static void soal1() {
        int x = 5;
        System.out.println("Nilai awal x = " + x);
        x++;
        System.out.println("Setelah di-increment, nilai x = " + x);
    }

    // 2. Luas Persegi Panjang
    public static void soal2() {
        int panjang = 50;
        int lebar = 45;
        int luas = panjang * lebar;
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    // 3. Persamaan Kuadrat
    public static void soal3() {
        double a = 2, b = 10, c = 5;
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Persamaan: " + a + "x² + " + b + "x + " + c);
        System.out.println("Diskriminan = " + D);
    }

    // 4. Operasi Matematika
    public static void soal4() {
        int x = 22, y = 33;
        System.out.println("Penjumlahan = " + (x + y));
        System.out.println("Perkalian = " + (x * y));
        System.out.println("Pembagian = " + ((double) x / y));
    }

    // 5. Luas Segitiga
    public static void soal5() {
        double a = 6, b = 8;
        double luas = 0.5 * a * b;
        System.out.println("Alas = " + b);
        System.out.println("Tinggi = " + a);
        System.out.println("Luas Segitiga = " + luas);
    }

    // 6. Pythagoras dan Keliling
    public static void soal6() {
        double a = 6, b = 8;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double keliling = a + b + c;
        System.out.println("Sisi miring (c) = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }

    // 7. Ubah String
    public static void soal7() {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
    }

    // 8. Waktu tempuh cahaya
    public static void soal8() {
        double jarakBulan = 384400; // km
        double jarakMatahari = 152100000; // km
        double c = 300000; // km/s
        double waktuBulan = jarakBulan / c;
        double waktuMatahari = jarakMatahari / c;
        System.out.println("Waktu ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu ke Matahari = " + waktuMatahari + " detik");
    }

    // 9. Konversi Suhu
    public static void soal9() {
        double C = 10, F = 15, R = 5;

        System.out.println("Celsius ke Fahrenheit = " + ((C * 9/5) + 32));
        System.out.println("Fahrenheit ke Celsius = " + ((F - 32) * 5/9));

        System.out.println("Celsius ke Reamur = " + (C * 4/5));
        System.out.println("Reamur ke Celsius = " + (R * 5/4));

        System.out.println("Fahrenheit ke Reamur = " + ((F - 32) * 4/9));
        System.out.println("Reamur ke Fahrenheit = " + ((R * 9/4) + 32));
    }
}

