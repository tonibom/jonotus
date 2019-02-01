
public class KateisMaksu extends Maksu{
    
    public KateisMaksu(double amount){
        super(amount);
    }
    
    @Override
    public void printPaymentDetails(){
        System.out.printf("\nMaksun maara: " + getAmount() + " euroa");
        System.out.println("\nMaksutapa: Kateinen\n");
    }
    
    
}
