public class DistributoreBenzina {
    private double deposito;
    private double europerlitro;

    public DistributoreBenzina(double prezzoperlitro){
        europerlitro = prezzoperlitro;
        deposito = 0;
    }

    public void rifornisci(double quantità){
        deposito = deposito + quantità;
    }

    public void vendi(double euro, Car unaAutomobile){
        double litri = euro / europerlitro;
        if(litri >= deposito){
            unaAutomobile.addgas(litri);
            deposito = deposito - litri;
        }
    }

    public void aggiorna(double prezzoperlitro){
        europerlitro = prezzoperlitro;
    }

    public double getDeposito(){
        return deposito;
    }
}
