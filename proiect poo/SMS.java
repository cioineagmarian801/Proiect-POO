public class SMS extends Mesaj implements OperatiiMesaj {
    private String nrTelefon;
    private int nrCaractere;
    private String operator;
    private boolean roaming;
    private boolean confirmareLivrare;

    public SMS() {
        super();
        this.nrTelefon = "";
        this.nrCaractere = 0;
        this.operator = "";
        this.roaming = false;
        this.confirmareLivrare = false;
    }

    public SMS(String expeditor, String destinatar, String continut, String dataTrimitere, boolean citit,
               String nrTelefon, int nrCaractere, String operator, boolean roaming, boolean confirmareLivrare) {
        super(expeditor, destinatar, continut, dataTrimitere, citit);
        this.nrTelefon = nrTelefon;
        this.nrCaractere = nrCaractere;
        this.operator = operator;
        this.roaming = roaming;
        this.confirmareLivrare = confirmareLivrare;
    }

    public SMS(SMS s) {
        super(s);
        this.nrTelefon = s.nrTelefon;
        this.nrCaractere = s.nrCaractere;
        this.operator = s.operator;
        this.roaming = s.roaming;
        this.confirmareLivrare = s.confirmareLivrare;
    }

    public double calculeazaCost() {
        int segmente = (nrCaractere + 159) / 160;
        double cost = segmente * 0.08;
        if (roaming) {
            cost = cost * 3;
        }
        return cost;
    }

    public boolean esteUrgent() {
        return getContinut().toLowerCase().contains("urgent");
    }

    public String getNrTelefon() { return nrTelefon; }
    public void setNrTelefon(String nrTelefon) { this.nrTelefon = nrTelefon; }
    public int getNrCaractere() { return nrCaractere; }
    public void setNrCaractere(int nrCaractere) { this.nrCaractere = nrCaractere; }
    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }
    public boolean isRoaming() { return roaming; }
    public void setRoaming(boolean roaming) { this.roaming = roaming; }
    public boolean isConfirmareLivrare() { return confirmareLivrare; }
    public void setConfirmareLivrare(boolean confirmareLivrare) { this.confirmareLivrare = confirmareLivrare; }

    @Override
    public String toString() {
        return "SMS{" + super.toString() + ", nrTelefon=" + nrTelefon + ", nrCaractere=" + nrCaractere
                + ", operator=" + operator + ", roaming=" + roaming
                + ", confirmareLivrare=" + confirmareLivrare + "}";
    }
}
