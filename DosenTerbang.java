class DosenTerbang extends Dosen implements Gaji {
    public DosenTerbang(String nama, String nip, String pendidikanTerahir, String mataKuliah, double totalGaji) {
        super(nama, nip, pendidikanTerahir, mataKuliah, totalGaji);
    }

    @Override
    public double jamStandby() {
        System.out.println("Standby hanya jika ada jam mengajar");
        return 0;
    }

    @Override
    public double tunjanganMakan() {
        return 10000;
    }

    @Override
    public double tunjanganTransport() {
        return 15000;
    }

    @Override
    public double honorBerdasarkanJam(int totalJam) {
        return totalJam * 40000;
    }
}
