
public abstract class Asiakas {
    
    private int asiakasnumero;
    
    public Asiakas(int asiakasnum){
        asiakasnumero = asiakasnum;
    }
    
    public int getAsiakasNum(){
        return asiakasnumero;
    }
    public void setAsiakasNum(int asiakasnum){
        asiakasnumero = asiakasnum;
    }
    
    abstract public void printAsiakas();
}
