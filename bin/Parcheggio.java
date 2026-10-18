public class Parcheggio{
    private int PostiDisponibili;
    private double costoh;

    public Parcheggio(){
        this.PostiDisponibili = 0;
        this.costoh = 0.0;
    }

    public Parcheggio(int PostiDisponibili, double costoh){
        if(PostiDisponibili > 0){
            this.PostiDisponibili = PostiDisponibili;
        }
        else{
            this.PostiDisponibili = 0;
        }

        if(costoh > 0){
            this.costoh = costoh;
        }
        else{
            this.costoh = 0.0;
        }
    }

    public Parcheggio(Parcheggio altroParcheggio){
        this.PostiDisponibili = altroParcheggio.PostiDisponibili;
        this.costoh = altroParcheggio.costoh;
    }

    public boolean entra(Car unaAutomobile){
        if(PostiDisponibili > 0){
            PostiDisponibili --;
            return true;
        }
        else{
            return false;
        }
    }

    public double esce(Car unaAutomobile, double ore){
            double costoTot = ore * costoh;
            this.PostiDisponibili ++;
            return costoTot;
    }

    public int getPostiDisponibili(){
        return PostiDisponibili;
    }

    public double getcostoh(){
        return costoh;
    }

    public void setcostoh(double costoh){
        if(costoh > 0){
            this.costoh = costoh;
        }
        else{
            costoh = 0;
        }
    }
}
