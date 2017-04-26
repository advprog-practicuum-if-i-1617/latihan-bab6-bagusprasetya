package PerusahaanX;

public class KaryawanSE extends Karyawan {

    private double tunjangan;
    private double bonusSE;

    public KaryawanSE() {
        tunjangan = 5500000.0;
        bonusSE = 300000.0;
    }

    public double gajiAtas5() {
        return super.getGaji() + super.getBonusAtas5() + tunjangan + bonusSE;
    }

    public double gajiBawah5() {
        return super.getGaji() + super.getBonusBawah5() + tunjangan + bonusSE;
    }
}
