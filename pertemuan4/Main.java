public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(123456, "Budi", 'C', "Teknik Informatika", 3.99);
        Mahasiswa mhs2 = new Mahasiswa(1235664, "Konco", 'C', "Teknik Informatika", 1.75);

        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilData();
        System.out.println("Status Kelulusan Budi: " + mhs1.Kelulusan());
        System.out.println("Prediksi Tahun Lulus Budi: " + mhs1.prediksiTahunLulus(2023));

        System.out.println("\nData Mahasiswa 2:");
        mhs2.tampilData();
        System.out.println("Status Kelulusan Konco: " + mhs2.Kelulusan());
        System.out.println("Prediksi Tahun Lulus Konco: " + mhs2.prediksiTahunLulus(2019));
    }
}