public class Girokonto implements Banking {
    //Fields
    int blz;
    int ktnr;
    String inhaber;
    String bankname;
    double ktstand;
    double disporahmen = -500;
    boolean zahlungsfaehig = true;
    boolean ecKarte = true;

    public Girokonto(int blz, int ktnr, String inhaber, String bankname, double ktstand) {
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

        if(this.ktstand-betrag > disporahmen) {
            this.ktstand -= betrag;
            System.out.println(betrag + " wurde ausgezahlt.");
        }
        return this.ktstand;
    }

    @Override
    public String toString(){
        StringBuilder ausgabe = new StringBuilder();
        return ausgabe.append("Kontoinhaber: ").append(inhaber).append("\tKontostand: ")
                .append(ktstand).append("\tKontonummer: ").append(ktnr).toString();
    }
}
