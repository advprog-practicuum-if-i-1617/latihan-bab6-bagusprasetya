package PerusahaanX;

public class Mainperusahaan {
    public static void main(String[] args) {
      KaryawanSE a = new KaryawanSE();
        KaryawanSE b = new KaryawanSE();
        KaryawanPM c = new KaryawanPM();
        KaryawanPM d = new KaryawanPM();
        System.out.println("Gaji Software Engineering dibawah 5 tahun : "+a.gajiBawah5());
        System.out.println("Gaji Software Engineering diatas 5 tahun : "+b.gajiAtas5());
        System.out.println("Gaji Project Manager dibawah 5 tahun : "+c.gajiBawah5());
        System.out.println("Gaji Project Manager diatas 10 tahun : "+d.gajiAtas10());
    }

}