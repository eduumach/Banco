/**
 *
 * @author eduardo
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0, selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c){
       System.out.println("Saldo anterior foi: "+saldoTotal);
       this.saldoTotal += c.getSaldo() * selic;
       System.out.println("Saldo final foi: "+saldoTotal);
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    
}
