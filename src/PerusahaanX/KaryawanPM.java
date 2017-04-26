package PerusahaanX;

public class KaryawanPM extends Karyawan {

    private double tunjangan;
    private double bonusPM;
    private double Apresiasi;
    private double ApresiasiAtas10;

    public KaryawanPM() {
        tunjangan = 6000000.0;
        bonusPM = 450000.0;
        Apresiasi = 225000.0;
        ApresiasiAtas10 = 700000.0;
    }

    public double gajiAtas5() {
        return super.getGaji() + super.getBonusAtas5() + tunjangan + bonusPM + Apresiasi;
    }

    public double gajiBawah5() {
        return super.getGaji() + super.getBonusBawah5() + tunjangan + bonusPM + Apresiasi;
    }

    public double gajiAtas10() {
        return super.getGaji() + super.getBonusAtas5() + tunjangan + ApresiasiAtas10;
    }
}
