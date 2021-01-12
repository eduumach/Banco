public class ContaCorrente extends Conta implements Tributavel{
	public void atualiza(double taxa) {
		this.deposita(this.getSaldo() * taxa * 2);
	}

    public double calculatributos() {
       return this.getSaldo() * 0.01;
    }
}
