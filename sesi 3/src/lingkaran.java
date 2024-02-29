public class lingkaran extends bangunDatar {
    protected double r;

    public lingkaran (double r, String nama) {
        setNama(nama);
        this.r = r;
        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        luas = 3.14 * r * r;
    }

    public void hitungKeliling() {
        keliling = 2 * 3.14 * r;
    }
}