
public class LuottokorttiMaksu extends Maksu{
    
    private int kortinNumero;
    
    public LuottokorttiMaksu(double amount, int kortinNumero){
        super(amount);
        this.kortinNumero = kortinNumero;
    }
    
    public int getKortinNumero(){
        return kortinNumero;
    }
    public void setKortinNumero(int numero){
        kortinNumero = numero;
    }
    
    @Override
    public void printPaymentDetails(){
        System.out.printf("\nMaksun maara: " + getAmount() + " euroa");
        System.out.printf("\nMaksutapa: Luottokortti");
        System.out.println("\nLuottokortin numero: " + kortinNumero + "\n");
    }
    
}
