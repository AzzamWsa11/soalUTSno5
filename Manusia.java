package RumahSakit;

class Manusia {
    protected String nama;
    protected int usia;
    protected String alamat;

    public Manusia(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
    }
}


