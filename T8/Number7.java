package T8;

 class Deret {
    void buatDeret(int[] x) {
        for (int i = 1; i < x.length; i++) {
            x[i] = x[i - 1] * 2;
        }
    }

    public static void main(String[] args) {
        int[] angka = new int[5];
        angka[0] = 6;

        Deret d = new Deret();
        d.buatDeret(angka); // pass-by-reference (array)

        for (int a : angka) {
            System.out.print(a + " ");
        }
    }
}
