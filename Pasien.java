package RumahSakit;

class Pasien extends Manusia {
    private String nomorRekamMedis;
    private String riwayatPenyakit;

    public Pasien(String nama, int usia, String alamat, String nomorRekamMedis) {
        super(nama, usia, alamat);
        this.nomorRekamMedis = nomorRekamMedis;
        this.riwayatPenyakit = "";
    }

    public void tambahRiwayatPenyakit(String penyakit) {
        riwayatPenyakit += penyakit + "; ";
        System.out.println("Riwayat penyakit pasien diperbarui: " + penyakit);
    }

    public String getNama() {
        return this.nama;
    }

    public String getRiwayatPenyakit() {
        return this.riwayatPenyakit;
    }
}
