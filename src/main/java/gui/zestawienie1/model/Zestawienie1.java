package gui.zestawienie1.model;

public class Zestawienie1 {
    private String nrKarty;
    private String dataD;
    private String kod;
    private double masa;
    private String jedn;
    private String firma;
    private String typ;
    private String nazwaSkrocona;
    private String nrMag;
    private String opis;
    private int nrKlienta;

    public Zestawienie1(String nrKarty, String dataD, String kod, double masa, String jedn, String firma, String typ, String nazwaSkrocona, String nrMag, String opis, int nrKlienta) {
        this.nrKarty = nrKarty;
        this.dataD = dataD;
        this.kod = kod;
        this.masa = masa;
        this.jedn = jedn;
        this.firma = firma;
        this.typ = typ;
        this.nazwaSkrocona = nazwaSkrocona;
        this.nrMag = nrMag;
        this.opis = opis;
        this.nrKlienta = nrKlienta;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public String getDataD() {
        return dataD;
    }

    public String getKod() {
        return kod;
    }

    public double getMasa() {
        return masa;
    }

    public String getJedn() {
        return jedn;
    }

    public String getFirma() {
        return firma;
    }

    public String getTyp() {
        return typ;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public String getNrMag() {
        return nrMag;
    }

    public String getOpis() {
        return opis;
    }

    public int getNrKlienta() {
        return nrKlienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zestawienie1{");
        sb.append("nrKarty='").append(nrKarty).append('\'');
        sb.append(", dataD='").append(dataD).append('\'');
        sb.append(", kod='").append(kod).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append(", jedn='").append(jedn).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", nazwaSkrocona='").append(nazwaSkrocona).append('\'');
        sb.append(", nrMag='").append(nrMag).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", nrKlienta='").append(nrKlienta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
