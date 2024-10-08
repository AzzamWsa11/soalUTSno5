package RumahSakit;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek dokter dan pasien
        Dokter dokter1 = new Dokter("Dr. Andi", 45, "Jl. Kesehatan No.1", "Spesialis Jantung", "12345");
        Pasien pasien1 = new Pasien("Budi", 30, "Jl. Sehat No.2", "RM001");
        Pasien pasien2 = new Pasien("Siti", 28, "Jl. Sehat No.3", "RM002");

        // Menampilkan informasi dokter
        dokter1.tampilkanInformasi();
        System.out.println();

        // Menampilkan informasi pasien
        System.out.println("Informasi Pasien 1:");
        pasien1.tampilkanInformasi();
        System.out.println("Riwayat Penyakit: " + pasien1.getRiwayatPenyakit());
        System.out.println();

        System.out.println("Informasi Pasien 2:");
        pasien2.tampilkanInformasi();
        System.out.println("Riwayat Penyakit: " + pasien2.getRiwayatPenyakit());
        System.out.println();

        // Menambah riwayat penyakit pada pasien
        pasien1.tambahRiwayatPenyakit("Demam");
        pasien2.tambahRiwayatPenyakit("Flu");

        // Menampilkan diagnosa dokter untuk pasien 1
        dokter1.diagnosaPenyakit(pasien1);
        System.out.println("Riwayat Penyakit Pasien 1: " + pasien1.getRiwayatPenyakit());
        System.out.println();

        // Membuat objek ruangan dengan kapasitas 1
        Ruangan ruangan1 = new Ruangan(101, 1);

        // Menambahkan pasien ke dalam ruangan
        try {
            ruangan1.tambahPasien(pasien1); // Berhasil
            ruangan1.tambahPasien(pasien2); // Akan gagal karena ruangan penuh
        } catch (RuanganPenuhException e) {
            System.out.println(e.getMessage());
        }
    }
}
