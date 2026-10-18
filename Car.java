public class Car {

    private double resa;
    private double gas;

    public Car(double resa){
        if(resa  > 0){
            this.resa = resa;
        }
        else{
            
            resa = 0.1;
        }
        gas = 0;
    }
    public void drive(double km){
        if(km < 0){
            km = 0;
        }
        else{
            gas = gas - km * resa;
            if(gas < 0){
                gas = 0;
            }
        }
    }

    public double getgas(){
        return gas;
    }

    public void addgas(double litri){
        if(litri <= 0){
            litri = 0;
        }
        else{
            gas = gas + litri;
        }
    }
}
