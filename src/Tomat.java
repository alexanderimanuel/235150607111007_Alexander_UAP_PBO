class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        super(100, 100, 25);
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