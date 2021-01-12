class Cliente{
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    
    
    public void cadastraCliente(String nome, String sobrenome, String cpf, int idade){
    	if(idade > 18) {
    		this.nome = nome;
    		this.sobrenome = sobrenome;
    		this.idade = idade;
    		this.cpf = cpf;
    	}else{
            System.out.println("Menor de idade, por isso não foi cadastrado!");
        }
    }
    
    public void validaCPF(String cpf) {
    	if (this.idade >= 18) {
    		this.cpf = cpf;
    	}else if(this.idade < 18){
    		System.out.println("Você não pode abrir uma conta, pois é menor de idade.");
    	}
    }
    
	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}else {
		this.cpf = cpf;
		}
	}

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", idade=" + idade;
    }
    
    
        
        
}
 