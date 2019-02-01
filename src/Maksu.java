
public abstract class Maksu {
    
    private double amount;
    
    public Maksu(double amount){
        this.amount = amount;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    
    abstract public void printPaymentDetails();
}
