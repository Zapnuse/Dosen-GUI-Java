class DosenTetap extends Dosen implements Gaji {
    public DosenTetap(String nama, String nip, String pendidikanTerahir, String mataKuliah, double totalGaji) {
        super(nama, nip, pendidikanTerahir, mataKuliah, totalGaji);
    }

    @Override
    public double jamStandby() {
        System.out.println("Standby 8 jam sehari");
        return 8;
    }

    @Override
    public double tunjanganMakan() {
        return 25000;
    }

    @Override
    public double tunjanganTransport() {
        return 35000;
    }

    @Override
    public double honorBerdasarkanJam(int totalJam) {
        return totalJam * 50000;
    }
}
