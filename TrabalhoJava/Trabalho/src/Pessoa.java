public class Pessoa {
    
    private String nome;
    private int idade;

    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) throws Exception{
        
        int quantidadePalavras = nome.trim().split(" ").length;

        if (quantidadePalavras > 1){
            this.nome = nome;
        }else{
            throw new Exception("Digite o nome completo! ");
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade) throws Exception{
        if(idade >= 18 ){
            this.idade = idade;
        }else{
            throw new Exception("Você precisa ser maior de 18 anos para JOGAR! ");
        }
    }

    public void mostrarDados(){
        System.out.printf("%s tem %d anos de idade ! \n", this.getNome(), this.getIdade());
    }

    public Pessoa(String nome, int idade) throws Exception{

        this.setNome(nome);
        this.setIdade(idade);
    }
}
