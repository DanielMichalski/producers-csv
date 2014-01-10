package gui.zestawienie_sumaryczne.model;

public class ZestawienieSumaryczne {
    private String typ;
    private double sumaMas;

    public ZestawienieSumaryczne(String typ, double sumaMas) {
        this.typ = typ;
        this.sumaMas = sumaMas;
    }

    public String getTyp() {
        return typ;
    }

    public double getSumaMas() {
        return sumaMas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ZestawienieSumaryczne{");
        sb.append("sumaMas=").append(sumaMas);
        sb.append(", typ='").append(typ).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
