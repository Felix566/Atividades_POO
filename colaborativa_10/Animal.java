package AtividadesColaborativas.colaborativa_10;

public class Animal {

    private String habitat;
    private double peso;

    public void dormir() {
        System.out.println("zzZZZZzz");
    }

    public void fazerBarulho() {
        System.out.println("barulho");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
