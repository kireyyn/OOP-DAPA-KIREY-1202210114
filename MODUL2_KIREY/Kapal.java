public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.mesin = mesin;
    }

    public void informasi() {
        System.out.println();
    }

    public void berlayar() {
        System.out.println();
    }

    public void berlayar(int kecepatan) {
        System.out.println(int kecepatan);
    }

    public void berlabuh() {
        System.out.println();
    }
}
    
