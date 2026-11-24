public class FisierText extends Fisier implements OperatiiFisier {
    private int nrCuvinte;
    private int nrLinii;
    private String codificare;
    private String limba;
    private boolean areFormatare;

    public FisierText() {
        super();
        this.nrCuvinte = 0;
        this.nrLinii = 0;
        this.codificare = "";
        this.limba = "";
        this.areFormatare = false;
    }

    public FisierText(String nume, String cale, double dimensiuneKB, String dataCreare, String autor,
                      int nrCuvinte, int nrLinii, String codificare, String limba, boolean areFormatare) {
        super(nume, cale, dimensiuneKB, dataCreare, autor);
        this.nrCuvinte = nrCuvinte;
        this.nrLinii = nrLinii;
        this.codificare = codificare;
        this.limba = limba;
        this.areFormatare = areFormatare;
    }

    public FisierText(FisierText f) {
        super(f);
        this.nrCuvinte = f.nrCuvinte;
        this.nrLinii = f.nrLinii;
        this.codificare = f.codificare;
        this.limba = f.limba;
        this.areFormatare = f.areFormatare;
    }

    public double calculeazaCostStocare() {
        return getDimensiuneKB() / 1024.0 * 0.02;
    }

    public boolean esteVoluminos() {
        return getDimensiuneKB() > 500;
    }

    public int getNrCuvinte() { return nrCuvinte; }
    public void setNrCuvinte(int nrCuvinte) { this.nrCuvinte = nrCuvinte; }
    public int getNrLinii() { return nrLinii; }
    public void setNrLinii(int nrLinii) { this.nrLinii = nrLinii; }
    public String getCodificare() { return codificare; }
    public void setCodificare(String codificare) { this.codificare = codificare; }
    public String getLimba() { return limba; }
    public void setLimba(String limba) { this.limba = limba; }
    public boolean isAreFormatare() { return areFormatare; }
    public void setAreFormatare(boolean areFormatare) { this.areFormatare = areFormatare; }

    @Override
    public String toString() {
        return "FisierText{" + super.toString() + ", nrCuvinte=" + nrCuvinte + ", nrLinii=" + nrLinii
                + ", codificare=" + codificare + ", limba=" + limba + ", areFormatare=" + areFormatare + "}";
    }
}
