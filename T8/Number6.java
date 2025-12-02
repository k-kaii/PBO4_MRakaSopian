package T8;

class Nilai {
    int[] data;

    Nilai(int... nilai) {
        data = nilai;
    }

    double rata() {
        int total = 0;
        for (int x : data) {
            total += x;
        }
        return (double) total / data.length;
    }

    public static void main(String[] args) {
        Nilai n = new Nilai(80, 90, 70, 100);

        System.out.println("Rata-rata = " + n.rata());
    }
}

