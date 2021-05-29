public final class Apostador extends Pessoa {
    
    private int cpf;
    
    public Apostador(String nome, int idade, int cpf) throws Exception {
        super(nome, idade);
        this.setCpf(cpf);
    }
      
    public int getCpf(){
        
        return cpf;
    }

    public void setCpf(int cpf){
        
        this.cpf = cpf;
       
    }

    public void mostrarDados(){

        System.out.printf("%s tem %d anos de idade e seu CPF é %s. \n",
        this.getNome(), this.getIdade(), this.getCpf());
    }

    public int toString(int i) {
        return 0;
    }
    
}
