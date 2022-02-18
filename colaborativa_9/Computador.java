package AtividadesColaborativas.colaborativa_9;

/*Solução referente a questão 5 do livro Batista Moraes
página 117
*/
public class Computador extends Equipamento{
    private String monitor;
    private int nucleos;

    /*Metodos de acesso e modificação referentes a 
    questão 6 do livro Batista Moraes página 117
    */
    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}
