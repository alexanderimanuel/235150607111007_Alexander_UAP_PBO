abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private double prosesBerbuah;
    private double perkembangan;
    private int buah;
    private int berbuah;

    public Tanaman(int masaHidup, int berbuah, double perkembangan) {
        this.masaHidup = masaHidup;
        this.berbuah = berbuah;
        this.perkembangan = perkembangan;
        this.lamaHidup = 0;
        this.prosesBerbuah = 0;
        this.buah = 0;
    }

    public abstract void berkembang();

    public String status() {
        return lamaHidup >= masaHidup ? "Mati" : "Hidup";
    }

    @Override
    public String toString() {
        return "Masa hidup: " + masaHidup + " hari\n" +
               "Umur tanaman: " + lamaHidup + " hari\n" +
               "Menghasilkan: " + buah + " buah\n" +
               "Status: " + status();
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }
}