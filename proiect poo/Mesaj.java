public class Mesaj {
    private String expeditor;
    private String destinatar;
    private String continut;
    private String dataTrimitere;
    private boolean citit;

    public Mesaj() {
        this.expeditor = "";
        this.destinatar = "";
        this.continut = "";
        this.dataTrimitere = "";
        this.citit = false;
    }

    public Mesaj(String expeditor, String destinatar, String continut, String dataTrimitere, boolean citit) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.continut = continut;
        this.dataTrimitere = dataTrimitere;
        this.citit = citit;
    }

    public Mesaj(Mesaj m) {
        this.expeditor = m.expeditor;
        this.destinatar = m.destinatar;
        this.continut = m.continut;
        this.dataTrimitere = m.dataTrimitere;
        this.citit = m.citit;
    }

    public String getExpeditor() { return expeditor; }
    public void setExpeditor(String expeditor) { this.expeditor = expeditor; }
    public String getDestinatar() { return destinatar; }
    public void setDestinatar(String destinatar) { this.destinatar = destinatar; }
    public String getContinut() { return continut; }
    public void setContinut(String continut) { this.continut = continut; }
    public String getDataTrimitere() { return dataTrimitere; }
    public void setDataTrimitere(String dataTrimitere) { this.dataTrimitere = dataTrimitere; }
    public boolean isCitit() { return citit; }
    public void setCitit(boolean citit) { this.citit = citit; }

    @Override
    public String toString() {
        return "expeditor=" + expeditor + ", destinatar=" + destinatar + ", continut=" + continut
                + ", dataTrimitere=" + dataTrimitere + ", citit=" + citit;
    }
}
