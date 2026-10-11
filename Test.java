public class Test {

    public static void main(String[] Args){
        DistributoreBenzina pompa = new DistributoreBenzina(1.80);
        pompa.rifornisci(100);

        Car fiat = new Car(0.06);
        Car audi = new Car(0.09);

        pompa.vendi(36, fiat);
        pompa.vendi(36, audi);
        System.out.println("Fiat: " + fiat.getGas() + " litri");
        System.out.println("Audi: " audi.getGas() + " litri ");
        System.out.println("Deposito: " + pompa.getDeposito() + " litri");

        fiat.drive(150);
        audi.drive(120);

        System.out.println("Dopo il viaggio:");
        System.out.println("Fiat: " + fiat.getGas() + " litri");
        System.out.println("Audi: " audi.getGas() + " litri ");

        pompa.aggiorna(1.95);
        pompa.vendi(50, fiat);
        System.out.println("Fiat dopo rifornimento " + fiat.getgas() + " litri ");
        System.out.println("Deposito: " + pompa.getDeposito() + "litri");

        if(pompa.getDeposito() < 30){
            pompa.rifornisci(100);
            System.out.println("pompa rifornita");

            audi.drive(100);
            System.out.println("audi dopo il secondo viaggio: " + audi.getGas() + " litri ");
        }
    }

}
