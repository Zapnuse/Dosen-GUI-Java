abstract class Dosen {
    private String nama;
    private String nip;
    private String pendidikanTerahir;
    private String mataKuliah;
    private double totalGaji;

    public abstract double jamStandby();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPendidikanAhir(String pendidikanAhir) {
        this.pendidikanTerahir = pendidikanAhir;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getPendidikanAhir() {
        return pendidikanTerahir;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public double getTotalGaji() {
        return totalGaji;
    }
}
