package T8;

class Bangun {
    int panjang, lebar;

    Bangun(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    int luas() {
        return panjang * lebar;
    }
}

class Hitam {
    Bangun luar, dalam;

    Hitam(Bangun luar, Bangun dalam) {
        this.luar = luar;
        this.dalam = dalam;
    }

    int luasHitam() {
        return luar.luas() - dalam.luas();
    }

    public static void main(String[] args) {
        Bangun luar = new Bangun(10, 5);
        Bangun dalam = new Bangun(8, 4);

        Hitam h = new Hitam(luar, dalam);
        System.out.println("Luas bidang hitam = " + h.luasHitam());
    }
}
