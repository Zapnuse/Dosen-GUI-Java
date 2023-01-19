interface Gaji {
    double tunjanganMakan();
    double tunjanganTransport();
    double honorBerdasarkanJam(int totalJam, String pendAhir);
}
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
    public double honorBerdasarkanJam(int totalJam, String pendAhir) {
        double honor = 0;
        switch (pendAhir) {
            case "S1":
                honor = totalJam * 40000;
                break;
            case "S2":
                honor = totalJam * 45000;
                break;
            case "S3":
                honor = totalJam * 50000;
                break;
            default:
                System.out.println("Pendidikan tidak valid");
                break;
        }
        return honor;
    }
}
