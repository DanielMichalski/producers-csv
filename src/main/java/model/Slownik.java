package model;

public class Slownik {
    private String gr;
    private String podgr;
    private String rodz;
    private String type;
    private String opis;
    private String nrOdpadu;

    public Slownik(String gr, String podgr, String rodz, String type, String opis, String nrOdpadu) {
        this.gr = gr;
        this.podgr = podgr;
        this.rodz = rodz;
        this.type = type;
        this.opis = opis;
        this.nrOdpadu = nrOdpadu;
    }

    public String getGr() {
        return gr;
    }

    public String getPodgr() {
        return podgr;
    }

    public String getRodz() {
        return rodz;
    }

    public String getType() {
        return type;
    }

    public String getOpis() {
        return opis;
    }

    public String getNrOdpadu() {
        return nrOdpadu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Slownik{");
        sb.append("gr='").append(gr).append('\'');
        sb.append(", podgr='").append(podgr).append('\'');
        sb.append(", rodz='").append(rodz).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", nrOdpadu='").append(nrOdpadu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
