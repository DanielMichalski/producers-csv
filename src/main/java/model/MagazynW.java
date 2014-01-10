package model;

public class MagazynW {
    private String dataW;
    private String nrKarty;
    private String nrMagw;
    private String nrOdpa;
    private String nrKlienta;
    private String firma;
    private String jedn;
    private double masa;

    public MagazynW(String dataW, String nrKarty, String nrMagw, String nrOdpa, String nrKlienta, String firma, String jedn, double masa) {
        this.dataW = dataW;
        this.nrKarty = nrKarty;
        this.nrMagw = nrMagw;
        this.nrOdpa = nrOdpa;
        this.nrKlienta = nrKlienta;
        this.firma = firma;
        this.jedn = jedn;
        this.masa = masa;
    }

    public String getDataW() {
        return dataW;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public String getNrMagw() {
        return nrMagw;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MagazynW{");
        sb.append("dataW='").append(dataW).append('\'');
        sb.append(", nrKarty='").append(nrKarty).append('\'');
        sb.append(", nrMagw='").append(nrMagw).append('\'');
        sb.append(", nrOdpa='").append(nrOdpa).append('\'');
        sb.append(", nrKlienta='").append(nrKlienta).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append(", jedn='").append(jedn).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
