public class FisierPdf extends Fisier implements OperatiiDocument {
    private int nrPagini;
    private String versiunePdf;
    private boolean protejatCuParola;
    private boolean areSemnaturaDigitala;
    private int rezolutieDPI;

    public FisierPdf() {
        super();
        this.nrPagini = 0;
        this.versiunePdf = "";
        this.protejatCuParola = false;
        this.areSemnaturaDigitala = false;
        this.rezolutieDPI = 0;
    }

    public FisierPdf(String nume, String cale, double dimensiuneKB, String dataCreare, String autor,
                     int nrPagini, String versiunePdf, boolean protejatCuParola,
                     boolean areSemnaturaDigitala, int rezolutieDPI) {
        super(nume, cale, dimensiuneKB, dataCreare, autor);
        this.nrPagini = nrPagini;
        this.versiunePdf = versiunePdf;
        this.protejatCuParola = protejatCuParola;
        this.areSemnaturaDigitala = areSemnaturaDigitala;
        this.rezolutieDPI = rezolutieDPI;
    }

    public FisierPdf(FisierPdf f) {
        super(f);
        this.nrPagini = f.nrPagini;
        this.versiunePdf = f.versiunePdf;
        this.protejatCuParola = f.protejatCuParola;
        this.areSemnaturaDigitala = f.areSemnaturaDigitala;
        this.rezolutieDPI = f.rezolutieDPI;
    }

    public double calculeazaCostStocare() {
        return getDimensiuneKB() / 1024.0 * 0.03;
    }

    public boolean estePregatitPentruPrint() {
        return !protejatCuParola && rezolutieDPI >= 150;
    }

    public int getNrPagini() { return nrPagini; }
    public void setNrPagini(int nrPagini) { this.nrPagini = nrPagini; }
    public String getVersiunePdf() { return versiunePdf; }
    public void setVersiunePdf(String versiunePdf) { this.versiunePdf = versiunePdf; }
    public boolean isProtejatCuParola() { return protejatCuParola; }
    public void setProtejatCuParola(boolean protejatCuParola) { this.protejatCuParola = protejatCuParola; }
    public boolean isAreSemnaturaDigitala() { return areSemnaturaDigitala; }
    public void setAreSemnaturaDigitala(boolean areSemnaturaDigitala) { this.areSemnaturaDigitala = areSemnaturaDigitala; }
    public int getRezolutieDPI() { return rezolutieDPI; }
    public void setRezolutieDPI(int rezolutieDPI) { this.rezolutieDPI = rezolutieDPI; }

    @Override
    public String toString() {
        return "FisierPdf{" + super.toString() + ", nrPagini=" + nrPagini + ", versiunePdf=" + versiunePdf
                + ", protejatCuParola=" + protejatCuParola + ", areSemnaturaDigitala=" + areSemnaturaDigitala
                + ", rezolutieDPI=" + rezolutieDPI + "}";
    }
}
