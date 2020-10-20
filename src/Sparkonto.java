public class Sparkonto implements Banking {
    //Fields
    int blz;
    int ktnr;
    String inhaber;
    String bankname;
    double ktstand;
    boolean ecKarte = false;

    public Sparkonto(int blz, int ktnr, String inhaber
            , String bankname, double ktstand) {
        this.blz = blz;
        this.ktnr = ktnr;
        this.inhaber = inhaber;
        this.bankname = bankname;
        this.ktstand = ktstand;
    }

    @Override
    public double kontostand(int blz, int ktnr) {
        return 0;
    }

    @Override
    public double einzahlung(int blz, int ktnr, double betrag) {
        return 0;
    }

    @Override
    public double auszahlung(int blz, int ktnr, double betrag) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();

        return ausgabe.append("Kontoinhaber: ").append(inhaber).append("\tKontostand: ")
                .append(ktstand).append("\tKontonummer: ").append(ktnr).toString();
    }
}
