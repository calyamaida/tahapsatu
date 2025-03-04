public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Budi Santoso");
        karyawan1.setGajiPokok(5000000);
        karyawan1.setPerusahaan(perusahaan);

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setNama("Ani Wijaya");
        karyawan2.setGajiPokok(6000000);
        karyawan2.setPerusahaan(perusahaan);

        System.out.println("1. Informasi Karyawan:");
        System.out.println(karyawan1.info());
        karyawan1.getPerusahaan();
        System.out.println();

        System.out.println("2. Informasi Karyawan:");
        System.out.println(karyawan2.info());
        karyawan2.getPerusahaan();
    }
}