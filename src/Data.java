import java.util.Calendar;


class Data{
    Calendar dataAtual = Calendar.getInstance();
    private int dia;
    private int mes;
    private int ano;
    
    public void adicionaData(){
        this.dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        this.mes = dataAtual.get(Calendar.MONTH);
        this.ano = dataAtual.get(Calendar.YEAR);
    }
    
   @Override
	public String toString() {
    	return this.dia +"/"+ this.mes +"/"+this.ano;
    }
}