
public class KateisAsiakas extends Asiakas {
    
    KateisMaksu kateismaksu;
    
    public KateisAsiakas(int asiakasnum, KateisMaksu kateinen) {
        super(asiakasnum);
        kateismaksu = kateinen;
    }

    @Override
    public void printAsiakas() {
        System.out.printf("Asiakasnumero: " + getAsiakasNum());
        kateismaksu.printPaymentDetails();
    }
}
