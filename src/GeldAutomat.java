public class GeldAutomat  {
    //Fileds
    int guthaben;
    String adresse;
    String betreiber;

    public GeldAutomat(int guthaben, String adresse, String betreiber){
        this.guthaben=guthaben;
        this.adresse=adresse;
        this.betreiber=betreiber;
    }

    public Banking auszahlung(Banking b,double betrag) {


         if(b.getClass().toString().equals("class Sparkonto")||b.getClass().toString().equals("class Girokonto")){
             b.auszahlung(123, 456, betrag);
         }
        return b;
    }



}



   /* String s=b.getClass().toString();
         if(s.equals("class Sparkonto")||s.equals("class Girokonto")){
                 System.out.println("Bedengung errfühlt");
                 }
                 return null;
                 }*/