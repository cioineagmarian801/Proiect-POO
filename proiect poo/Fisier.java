public class Fisier {
    private String nume;
    private String cale;
    private double dimensiuneKB;
    private String dataCreare;
    private String autor;

    public Fisier() {
        this.nume = "";
        this.cale = "";
        this.dimensiuneKB = 0;
        this.dataCreare = "";
        this.autor = "";
    }

    public Fisier(String nume, String cale, double dimensiuneKB, String dataCreare, String autor) {
        this.nume = nume;
        this.cale = cale;
        this.dimensiuneKB = dimensiuneKB;
        this.dataCreare = dataCreare;
        this.autor = autor;
    }

    public Fisier(Fisier f) {
        this.nume = f.nume;
        this.cale = f.cale;
        this.dimensiuneKB = f.dimensiuneKB;
        this.dataCreare = f.dataCreare;
        this.autor = f.autor;
    }

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public String getCale() { return cale; }
    public void setCale(String cale) { this.cale = cale; }
    public double getDimensiuneKB() { return dimensiuneKB; }
    public void setDimensiuneKB(double dimensiuneKB) { this.dimensiuneKB = dimensiuneKB; }
    public String getDataCreare() { return dataCreare; }
    public void setDataCreare(String dataCreare) { this.dataCreare = dataCreare; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String toString() {
        return "nume=" + nume + ", cale=" + cale + ", dimensiuneKB=" + dimensiuneKB
                + ", dataCreare=" + dataCreare + ", autor=" + autor;
    }
}
