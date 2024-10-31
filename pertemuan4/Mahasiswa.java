public class Mahasiswa {

    int NIM;
    String Nama;
    char Kelas;
    String Prodi;
    double IPK;

    public Mahasiswa(int NIM, String Nama, char Kelas, String Prodi, double IPK) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.Prodi = Prodi;
        this.IPK = IPK;
    }

    public void tampilData(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Kelas: " + Kelas);
        System.out.println("Prodi: " + Prodi);
        System.out.println("IPK: " + IPK);
    }

    public String Kelulusan() {
        return (IPK >= 2.50) ? "Lulus" : "Tidak Lulus";
    }

    public int prediksiTahunLulus(int tahunMasuk) {
        return tahunMasuk + 4;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public double getIPK() {
        return this.IPK;
    }

    public void updateIPK(double ipkBaru) {
        this.IPK = ipkBaru;
    }

}