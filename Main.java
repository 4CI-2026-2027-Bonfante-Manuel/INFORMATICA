
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Conto conto = new Conto("Mario Rossi", 100.0);

        File fileDaLeggere = new File("pagamenti.txt");
        Scanner sc = new Scanner(fileDaLeggere);

        FileWriter fileLog = new FileWriter("log_esiti.txt", true);
        PrintWriter pw = new PrintWriter(fileLog);

        while (sc.hasNextLine() == true) {
            
            String riga = sc.nextLine();

            String[] parti = riga.split(";");

            String beneficiario = parti[0];

            String testoImporto = parti[1];
            double importo = Double.parseDouble(testoImporto);

            Pagamento pagamento = new Pagamento(beneficiario, importo);

            try {
                conto.effettuaPagamento(pagamento);
                pw.println("PAGAMENTO RIUSCITO: " + beneficiario + " " + importo);

            } catch (SaldoInsufficienteException e) {
                pw.println("PAGAMENTO FALLITO: " + e.getMessage());
            }
        }

        sc.close();
        pw.close();
    }
}
