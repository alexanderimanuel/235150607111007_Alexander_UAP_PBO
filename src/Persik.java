class Persik extends Tanaman implements Perawatan {
    public Persik() {
        super(180, 250, 15);
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
        setPerkembangan(getPerkembangan() + 2.5);
    }
}