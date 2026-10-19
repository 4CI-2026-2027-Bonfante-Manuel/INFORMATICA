
public class Conto{
    private String intestatario;
    private double saldo;

    public Conto(String intestatario, double saldo){
        if(intestatario != null){
            this.intestatario = intestatario;
        }
        else{
            this.intestatario = "Sconosciuto";
        }
        
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            this.saldo = 0.0;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String effettuaPagamento(Pagamento pagamento) throws SaldoInsufficienteException{
            if(pagamento.getImporto() <= 0){
                throw new IllegalArgumentException ("L'importo deve essere maggiore di 0");
                }
                
            if(pagamento.getImporto() > saldo){
                throw new SaldoInsufficienteException("Non è possibile effettuare questo pagamebto");
                }
            
                saldo = saldo - pagamento.getImporto();
                
                String out="";
                out+="Pagemento effettuato.";
                out+="\n Beneficiario: "+  pagamento.getBeneficiario();
                out+="\n Importo: " + pagamento.getImporto();
                return out;
    }
            
}

    
    