package AtividadesColaborativas.colaborativa_10;

public class Cachorro extends Mamifero{

    private String nome;
    private int idade;
    private boolean adotado;
    private String racaCanina;

    @Override
    public void fazerBarulho(){
        System.out.println("au au");
    }
    
    @Override
    public void dormir(){
        System.out.println("O cachorro "+getNome() +" está dormindo");
        System.out.println("zzzZZZzzz");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public String getRacaCanina() {
        return racaCanina;
    }

    public void setRacaCanina(String racaCanina) {
        this.racaCanina = racaCanina;
    }
    
    
    
}
