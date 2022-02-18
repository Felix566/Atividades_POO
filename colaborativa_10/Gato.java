package AtividadesColaborativas.colaborativa_10;

public class Gato extends Mamifero{
    
    private String nome;
    private int espectativaDeVida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEspectativaDeVida() {
        return espectativaDeVida;
    }

    public void setEspectativaDeVida(int espectativaDeVida) {
        this.espectativaDeVida = espectativaDeVida;
    }
    
    
    @Override
    public void fazerBarulho(){
        System.out.println("miau miau");
    }
    
        @Override
    public void dormir(){
        System.out.println("O gato "+getNome() +" está dormindo");
        System.out.println("zzzZZZzzz");
    }
    
}
