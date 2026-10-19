
public class Pagamento{
    private String beneficiario;
    private double importo;
    
    public Pagamento(String beneficiario, double importo){
        if(beneficiario != null){
            this.beneficiario = beneficiario;
        }
        if(importo > 0){
            this.importo = importo;
        }
        else{
            this.importo = 0;
        }
    }
    
    public String getBeneficiario(){
        return beneficiario;
    }
    
    public double getImporto(){
        return importo;
    }
    
    
}
