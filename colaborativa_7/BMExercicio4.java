package AtividadesColaborativas.colaborativa_7;

//Questão referente a atividade de aprendizagem 4 do livro Batista Moraes
//Página 78
public class BMExercicio4 {
    String marca;
    int voltagem;
    int potenciaEmWatts;
    String modelo;
    String cor;
    boolean funciona = false;
    
    public void acender(){
        funciona = true;
    }
    public void apagar(){
        funciona = false;
    }
    public void testarLampada(){
        if(funciona == true){
            System.out.println("A lâmpada está acesa.");
        }else{
            System.out.println("A lâmpada está apagada.");
        }
    }
}
