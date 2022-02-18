package AtividadesColaborativas.colaborativa_7;

public class BMExercicio5 {
    String nome;
    String treinador;
    String titulos;
    double folhaSalarial;
    String campeonatoEstadual;
    int pontosGanhos;
    
    void mostraTitulos(){
        System.out.println("Os titulos conquistados foram: ");
        System.out.println(titulos);
    }
    
    void informaPontosConquistados(){
        if(pontosGanhos > 0){
            System.out.println("O clube "+nome+" conquistou "+pontosGanhos+" no campeonato "+campeonatoEstadual);
        }else{
            System.out.println("O clube "+nome+" ainda não conquistou pontos na competição");
        }
    }
}
