package RumahSakit;

import java.util.ArrayList;

public class Ruangan {
    private int nomorRuangan;
    private int kapasitas;
    private ArrayList<Pasien> daftarPasien;

    public Ruangan(int nomorRuangan, int kapasitas) {
        this.nomorRuangan = nomorRuangan;
        this.kapasitas = kapasitas;
        this.daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien pasien) throws RuanganPenuhException {
        if (daftarPasien.size() < kapasitas) {
            daftarPasien.add(pasien);
            System.out.println("Pasien " + pasien.getNama() + " berhasil ditambahkan ke ruangan " + nomorRuangan);
        } else {
            throw new RuanganPenuhException("Ruangan " + nomorRuangan + " sudah penuh.");
        }
    }
}
