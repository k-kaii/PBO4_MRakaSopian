package T8;
class Kasir {
    int harga, jumlah;
    double diskon;

    Kasir(int harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    double total() {
        double total = harga * jumlah;
        total -= total * diskon;
        return total;
    }

    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(10000, 3);
        Kasir k3 = new Kasir(10000, 3, 0.10);

        System.out.println("Total 1 = " + k1.total());
        System.out.println("Total 2 = " + k2.total());
        System.out.println("Total 3 = " + k3.total());
    }
}
