class Gerente extends FuncionarioAutenticavel implements Autenticavel{
	private int senha, numeroDeFuncionariosGerenciados;
    
    public void contrata(String nome, String rg, int idade, int senha, int numeroDeFuncionariosGerenciados){
        if(idade >= 18) {
            this.setNome(nome);
            this.setRg(rg);
            this.setIdade(idade);
            this.setSalario(1500);
            this.dataEntrada.adicionaData();
            this.setEstaNaEmpresa(true);
            this.senha = senha;
            this.setEstaNaEmpresa(true);
            this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
            System.out.println("Cadastrado.\n");
        }else {
            System.out.println("Menor de idade.");
            this.setEstaNaEmpresa(false);
        }
    }
    
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        }else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    
    
    @Override
    public String toString() {
        return "Gerente{" + "senha=" + senha + ", numeroDeFuncionariosGerenciados=" + numeroDeFuncionariosGerenciados + super.toString() + '}';
    }
}