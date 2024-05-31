class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        super(60, 150, 35);
    }

    @Override
    public void berkembang() {
        if (status().equals("Hidup")) {
            setLamaHidup(getLamaHidup() + 1);
            setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
            if (getProsesBerbuah() >= getBerbuah()) {
                setBuah(getBuah() + 1);
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 5);
    }
}