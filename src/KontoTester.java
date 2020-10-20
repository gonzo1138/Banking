public class KontoTester {
    public static void main(String[] args) {

      Banking girokonto1 = new Girokonto(65432125, 12345678, "Torsten Sendler",
              "Applebank", 45323);

      Banking sparkonto1 = new Sparkonto(342443, 312313, "Torsten Sendler",
              "Huaweibank",10);
      Banking tagesgelkonto1 = new Tagesgelkonto(1233421, 12413, "Torsten Sendler"
              , "Sparkasse", 1);

        System.out.println(girokonto1.getClass());
        System.out.println(sparkonto1.getClass());
        System.out.println(tagesgelkonto1.getClass());

        GeldAutomat b= new GeldAutomat(100000,"köln","Sparkasse Köln");
         b.auszahlung(sparkonto1,150);



    }
}
