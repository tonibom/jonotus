
public class LuottokorttiAsiakas extends Asiakas {
    
    LuottokorttiMaksu luottomaksu;
    
    public LuottokorttiAsiakas(int asiakasnum, LuottokorttiMaksu luotto) {
        super(asiakasnum);
        luottomaksu = luotto;
    }

    @Override
    public void printAsiakas() {
        System.out.printf("Asiakasnumero: " + getAsiakasNum());
        luottomaksu.printPaymentDetails();
    }
}
