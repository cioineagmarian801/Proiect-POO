public class FisierImagine extends Fisier implements OperatiiFisier {
    private int latime;
    private int inaltime;
    private String format;
    private int adancimeCuloare;
    private boolean areTransparenta;

    public FisierImagine() {
        super();
        this.latime = 0;
        this.inaltime = 0;
        this.format = "";
        this.adancimeCuloare = 0;
        this.areTransparenta = false;
    }

    public FisierImagine(String nume, String cale, double dimensiuneKB, String dataCreare, String autor,
                         int latime, int inaltime, String format, int adancimeCuloare, boolean areTransparenta) {
        super(nume, cale, dimensiuneKB, dataCreare, autor);
        this.latime = latime;
        this.inaltime = inaltime;
        this.format = format;
        this.adancimeCuloare = adancimeCuloare;
        this.areTransparenta = areTransparenta;
    }

    public FisierImagine(FisierImagine f) {
        super(f);
        this.latime = f.latime;
        this.inaltime = f.inaltime;
        this.format = f.format;
        this.adancimeCuloare = f.adancimeCuloare;
        this.areTransparenta = f.areTransparenta;
    }

    public double calculeazaCostStocare() {
        return getDimensiuneKB() / 1024.0 * 0.05;
    }

    public boolean esteVoluminos() {
        return getDimensiuneKB() > 2048;
    }

    public int getLatime() { return latime; }
    public void setLatime(int latime) { this.latime = latime; }
    public int getInaltime() { return inaltime; }
    public void setInaltime(int inaltime) { this.inaltime = inaltime; }
    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }
    public int getAdancimeCuloare() { return adancimeCuloare; }
    public void setAdancimeCuloare(int adancimeCuloare) { this.adancimeCuloare = adancimeCuloare; }
    public boolean isAreTransparenta() { return areTransparenta; }
    public void setAreTransparenta(boolean areTransparenta) { this.areTransparenta = areTransparenta; }

    @Override
    public String toString() {
        return "FisierImagine{" + super.toString() + ", latime=" + latime + ", inaltime=" + inaltime
                + ", format=" + format + ", adancimeCuloare=" + adancimeCuloare
                + ", areTransparenta=" + areTransparenta + "}";
    }
}
