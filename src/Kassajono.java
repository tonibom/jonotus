
public class Kassajono implements JonoInterface{
    
    Asiakas[] jonottajat;
    
    public Kassajono(int jononKoko){
        jonottajat = new Asiakas[jononKoko];
    }
    
    @Override
    public void lisaaElementti(Asiakas asiakas) {
        
        int i = 0;
        Asiakas[] aputaulu;
        boolean ulos = false;
        
        while(!ulos){
            
            if(jonottajat[i] != null){
                i++;
                if(i > (jonottajat.length-1)){
                    ulos = true;
                }
                
            }else{
                ulos = true;
            }
        }
        
        if(i > jonottajat.length-1){
            
            aputaulu = new Asiakas[i+1];
            i = 0;
            for(Asiakas siirto : jonottajat){
                aputaulu[i] = siirto;
                i++;
            }
            jonottajat = aputaulu;
            jonottajat[i] = asiakas;
            
        }else{
            jonottajat[i] = asiakas;
        }
    }

    @Override
    public Asiakas palautaElementti() {
        
        int i = 0;
        Asiakas apu;
        
        apu = jonottajat[0];
        jonottajat[0] = null;
        
        while(i < jonottajat.length-1){
            jonottajat[i] = jonottajat[i+1];
            jonottajat[i+1] = null;
            i++;
        }
        return apu;
    }

    @Override
    public boolean onkoJonoTyhja() {
        
        boolean tyhja = true, ulos = false;
        int i = 0;
        
        while(!ulos){
            
            if(jonottajat[i] != null){
                tyhja = false;
                ulos = true;
            }
            i++;
            if(i > (jonottajat.length-1)){
                ulos = true;
            }
        }
        return tyhja;
    }

    @Override
    public boolean onkoJonoOlemassa() {
        
        if(jonottajat != null){
            return true;
        }else{
            return false;
        }
    }
}
