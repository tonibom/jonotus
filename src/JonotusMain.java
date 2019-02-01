import java.util.Random;

public class JonotusMain {
    
    static Random random = new Random();
    static Kassajono jono = new Kassajono(1);
    
    public static void main(String args[]) throws InterruptedException{
        
        int muutostenLkm = generoiArvo(10,16);
        
        for(int i = 0; i < muutostenLkm; i++){
            jononMuutos();
            Thread.sleep(3000);
        }
    }
    
    private static int generoiArvo(int pienin, int suurin){
        
        int randomArvo;
        
        if(pienin == 0){
            randomArvo = random.nextInt(suurin);
            
        }else{
            randomArvo = random.nextInt(suurin - pienin) + pienin;
        }
        
        return randomArvo;
    }
    
    public static Asiakas generoiAsiakas(){
        
        int maksutapa = generoiArvo(0,2); // 0 -> KateisAsiakas tai 1 -> LuottokorttiAsiakas
        
        if(maksutapa == 0){ // luodaan KateisAsiakas
            
            KateisMaksu kateinen = new KateisMaksu(generoiArvo(1,101));
            KateisAsiakas jonottaja = new KateisAsiakas(generoiArvo(100000, 1000000), kateinen);
            return jonottaja;
            
        }else{ // luodaan LuottokorttiAsiakas
            
            LuottokorttiMaksu luotto = new LuottokorttiMaksu(generoiArvo(1,251), generoiArvo(100000, 1000000));
            LuottokorttiAsiakas jonottaja = new LuottokorttiAsiakas(generoiArvo(100000, 1000000), luotto);
            return jonottaja;
        }
    }
    
    public static void jononMuutos(){
        
        int tapahtuma = generoiArvo(0,2);
        
        if(tapahtuma == 0){ //Uusi asiakas saapuu jonoon
            jono.lisaaElementti(generoiAsiakas());
            System.out.println("Uusi asiakas saapui jonoon.");
            
        }else{ //Asiakas lähtee jonosta
            
            if(!jono.onkoJonoTyhja()){ // Onko jonossa ketään? Voiko jonosta lahteä ketään?
                Asiakas poistuva = jono.palautaElementti();
                System.out.println("\nJonon ensimmainen asiakas maksoi ja lahti.\n\nMaksun tiedot:");
                poistuva.printAsiakas();
                
            }else{ // Jono on tyhjä
                System.out.println("Jono ei muutu.");
            }
        }
    }
}
