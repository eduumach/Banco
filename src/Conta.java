abstract class Conta {
	private static int numeroDaConta = 1;
	private int numero;
	private double saldo;
	private double limite;
        Cliente titular = new Cliente();
    
    public void cadastraConta(String nome, String sobrenome, String cpf, int idade) {
    	double saldoP = 0;
    	double limiteP = 1000;
    	if(idade > 18) {
    		this.titular.cadastraCliente(nome, sobrenome, cpf, idade);
    		this.numero = numeroDaConta;
    		this.saldo = saldoP;
    		this.limite = limiteP;
    	}else{
            System.out.println("Você é menor de idade!");
        }
    }
    
    public boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void deposita(double quantidade){
        this.saldo += quantidade;
    }
    
    public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

    public boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == false){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "\n" + this.titular + '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNumeroDaConta() {
        return numeroDaConta;
    }

    public static void setNumeroDaConta(int numeroDaConta) {
        Conta.numeroDaConta = numeroDaConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
}