package gui.zestawienie2.model;

public class Zestawienie2 {
    private String nrKarty;
    private String dataW;
    private double masa;
    private String kod;
    private String firma;
    private String nazwaSkrocona;
    private String typ;
    private String opis;
    private int nrKlienta;

    public Zestawienie2(
            String nrKarty,
            String dataW,
            double masa,
            String kod,
            String firma,
            String nazwaSkrocona,
            String typ,
            String opis,
            int nrKlienta) {

        this.nrKarty = nrKarty;
        this.dataW = dataW;
        this.masa = masa;
        this.kod = kod;
        this.firma = firma;
        this.nazwaSkrocona = nazwaSkrocona;
        this.typ = typ;
        this.opis = opis;
        this.nrKlienta = nrKlienta;
    }

    public String getNrKarty() {
        return nrKarty;
    }

    public String getDataW() {
        return dataW;
    }

    public double getMasa() {
        return masa;
    }

    public String getKod() {
        return kod;
    }

    public String getFirma() {
        return firma;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public String getTyp() {
        return typ;
    }

    public String getOpis() {
        return opis;
    }

    public int getNrKlienta() {
        return nrKlienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zestawienie2{");
        sb.append("nrKarty='").append(nrKarty).append('\'');
        sb.append(", dataW='").append(dataW).append('\'');
        sb.append(", masa='").append(masa).append('\'');
        sb.append(", kod='").append(kod).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append(", nazwaSkrocona='").append(nazwaSkrocona).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", nrKlienta='").append(nrKlienta).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
