public class FisierDoc extends Fisier implements OperatiiDocument {
    private int nrCuvinte;
    private String versiuneWord;
    private boolean areMacrouri;
    private boolean modificariUrmarite;
    private String sablon;

    public FisierDoc() {
        super();
        this.nrCuvinte = 0;
        this.versiuneWord = "";
        this.areMacrouri = false;
        this.modificariUrmarite = false;
        this.sablon = "";
    }

    public FisierDoc(String nume, String cale, double dimensiuneKB, String dataCreare, String autor,
                     int nrCuvinte, String versiuneWord, boolean areMacrouri,
                     boolean modificariUrmarite, String sablon) {
        super(nume, cale, dimensiuneKB, dataCreare, autor);
        this.nrCuvinte = nrCuvinte;
        this.versiuneWord = versiuneWord;
        this.areMacrouri = areMacrouri;
        this.modificariUrmarite = modificariUrmarite;
        this.sablon = sablon;
    }

    public FisierDoc(FisierDoc f) {
        super(f);
        this.nrCuvinte = f.nrCuvinte;
        this.versiuneWord = f.versiuneWord;
        this.areMacrouri = f.areMacrouri;
        this.modificariUrmarite = f.modificariUrmarite;
        this.sablon = f.sablon;
    }

    public double calculeazaCostStocare() {
        return getDimensiuneKB() / 1024.0 * 0.02;
    }

    public boolean estePregatitPentruPrint() {
        return !modificariUrmarite;
    }

    public int getNrCuvinte() { return nrCuvinte; }
    public void setNrCuvinte(int nrCuvinte) { this.nrCuvinte = nrCuvinte; }
    public String getVersiuneWord() { return versiuneWord; }
    public void setVersiuneWord(String versiuneWord) { this.versiuneWord = versiuneWord; }
    public boolean isAreMacrouri() { return areMacrouri; }
    public void setAreMacrouri(boolean areMacrouri) { this.areMacrouri = areMacrouri; }
    public boolean isModificariUrmarite() { return modificariUrmarite; }
    public void setModificariUrmarite(boolean modificariUrmarite) { this.modificariUrmarite = modificariUrmarite; }
    public String getSablon() { return sablon; }
    public void setSablon(String sablon) { this.sablon = sablon; }

    @Override
    public String toString() {
        return "FisierDoc{" + super.toString() + ", nrCuvinte=" + nrCuvinte + ", versiuneWord=" + versiuneWord
                + ", areMacrouri=" + areMacrouri + ", modificariUrmarite=" + modificariUrmarite
                + ", sablon=" + sablon + "}";
    }
}
