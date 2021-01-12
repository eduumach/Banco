public class ContaPoupanca extends Conta{
	public void atualiza(double taxa) {
		this.deposita(taxa - 0.10);
	}
}
