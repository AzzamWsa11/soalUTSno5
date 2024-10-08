package RumahSakit;

class Dokter extends Manusia {
    private String spesialisasi;
    private String nomorLisensi;

    public Dokter(String nama, int usia, String alamat, String spesialisasi, String nomorLisensi) {
        super(nama, usia, alamat);
        this.spesialisasi = spesialisasi;
        this.nomorLisensi = nomorLisensi;
    }

    public void diagnosaPenyakit(Pasien pasien) {
        System.out.println("Dokter " + nama + " mendiagnosa pasien " + pasien.getNama() + ".");
        // Diagnosa bisa berupa string atau logika berdasarkan riwayat penyakit pasien
    }
}

