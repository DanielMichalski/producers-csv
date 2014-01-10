package model;

public class Dostawca {
    private String nazwaSkrocona;
    private String nrKlienta;
    private String miejscowosc;
    private String ulica;

    public Dostawca(String nazwaSkrocona, String nrKlienta, String miejscowosc, String ulica) {
        this.nazwaSkrocona = nazwaSkrocona;
        this.nrKlienta = nrKlienta;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
    }

    public String getNazwaSkrocona() {
        return nazwaSkrocona;
    }

    public String getNrKlienta() {
        return nrKlienta;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dostawca{");
        sb.append("nazwaSkrocona='").append(nazwaSkrocona).append('\'');
        sb.append(", nrKlienta='").append(nrKlienta).append('\'');
        sb.append(", miejscowosc='").append(miejscowosc).append('\'');
        sb.append(", ulica='").append(ulica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
