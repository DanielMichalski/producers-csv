package model;

public class MagazynP {
    private String nrMag;
    private String nrKarty;
    private String nrOdpa;
    private String nrKlienta;
    private String firma;
    private String jedn;
    private double masa;
    private String dataD;

    public MagazynP(String nrMag, String nrKarty, String nrOdpa, String nrKlienta, String firma, String jedn, double masa, String dataD) {
        this.nrMag = nrMag;
        this.nrKarty = nrKarty;
        this.nrOdpa = nrOdpa;
        this.nrKlienta = nrKlienta;
        this.firma = firma;
        this.jedn = jedn;
        this.masa = masa;
        this.dataD = dataD;
    }

    public String getNrMag() {
        return nrMag;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public String getNrOdpa() {
        return nrOdpa;
    }

    public String getNrKlienta() {
        return nrKlienta;
    }

    public String getFirma() {
        return firma;
    }

    public String getJedn() {
        return jedn;
    }

    public double getMasa() {
        return masa;
    }

    public String getDataD() {
        return dataD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MagazynP{");
        sb.append("nrMag='").append(nrMag).append('\'');
        sb.append(", nrKarty='").append(nrKarty).append('\'');
        sb.append(", nrOdpa='").append(nrOdpa).append('\'');
        sb.append(", nrKlienta='").append(nrKlienta).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append(", jedn='").append(jedn).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append(", dataD='").append(dataD).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
