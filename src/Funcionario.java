class Funcionario {

	private String nome;
	private String rg;
	private double salario;
	protected Data dataEntrada = new Data();
	private boolean estaNaEmpresa;
	private int idade;
	
	public void contrata(String nome, String rg, int idade, int dia, int mes, int ano){
		if(idade > 18) {
			this.nome = nome;
			this.rg = rg;
			this.idade = idade;
			this.salario = 1500;
			this.dataEntrada.adicionaData();
			this.estaNaEmpresa = true;
			System.out.println("Cadastrado.\n");
			this.estaNaEmpresa = true;
			
		}else {
			System.out.println("Menor de idade.");
			this.estaNaEmpresa = false;
		}
		
	}

    public void aumento(double aumento){
        this.salario = this.salario + aumento;
    }

    public double setcalculaGanhoAnual(){
        double anual; 
        anual = this.salario * 12;
        return anual;
    }

    public void demite(){
        this.estaNaEmpresa = false;
        System.out.println("\nVocê foi demintido!");
    }
        @Override
	public String toString() {
		return "\nnome=" + nome + ", rg=" + rg + ", salario=" + salario + ", dataEntrada=" + dataEntrada
				+ ",\nestaNaEmpresa=" + estaNaEmpresa + ", idade=" + idade;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
        
}