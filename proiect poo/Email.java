public class Email extends Mesaj implements OperatiiMesaj {
    private String subiect;
    private int nrAtasamente;
    private double dimensiuneAtasamenteMB;
    private String cc;
    private int prioritate;

    public Email() {
        super();
        this.subiect = "";
        this.nrAtasamente = 0;
        this.dimensiuneAtasamenteMB = 0;
        this.cc = "";
        this.prioritate = 0;
    }

    public Email(String expeditor, String destinatar, String continut, String dataTrimitere, boolean citit,
                 String subiect, int nrAtasamente, double dimensiuneAtasamenteMB, String cc, int prioritate) {
        super(expeditor, destinatar, continut, dataTrimitere, citit);
        this.subiect = subiect;
        this.nrAtasamente = nrAtasamente;
        this.dimensiuneAtasamenteMB = dimensiuneAtasamenteMB;
        this.cc = cc;
        this.prioritate = prioritate;
    }

    public Email(Email e) {
        super(e);
        this.subiect = e.subiect;
        this.nrAtasamente = e.nrAtasamente;
        this.dimensiuneAtasamenteMB = e.dimensiuneAtasamenteMB;
        this.cc = e.cc;
        this.prioritate = e.prioritate;
    }

    public double calculeazaCost() {
        return 0.01 + nrAtasamente * 0.02 + dimensiuneAtasamenteMB * 0.005;
    }

    public boolean esteUrgent() {
        return prioritate == 3 || subiect.toLowerCase().contains("urgent");
    }

    public String getSubiect() { return subiect; }
    public void setSubiect(String subiect) { this.subiect = subiect; }
    public int getNrAtasamente() { return nrAtasamente; }
    public void setNrAtasamente(int nrAtasamente) { this.nrAtasamente = nrAtasamente; }
    public double getDimensiuneAtasamenteMB() { return dimensiuneAtasamenteMB; }
    public void setDimensiuneAtasamenteMB(double dimensiuneAtasamenteMB) { this.dimensiuneAtasamenteMB = dimensiuneAtasamenteMB; }
    public String getCc() { return cc; }
    public void setCc(String cc) { this.cc = cc; }
    public int getPrioritate() { return prioritate; }
    public void setPrioritate(int prioritate) { this.prioritate = prioritate; }

    @Override
    public String toString() {
        return "Email{" + super.toString() + ", subiect=" + subiect + ", nrAtasamente=" + nrAtasamente
                + ", dimensiuneAtasamenteMB=" + dimensiuneAtasamenteMB + ", cc=" + cc
                + ", prioritate=" + prioritate + "}";
    }
}
