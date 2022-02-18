package AtividadesColaborativas.colaborativa_6;

import java.util.Scanner;
public class CTExercicio3 {
    public static void main(String[] args) {
    final int TOTAL_ALUNOS = 10;
    double mediaNotas = 0;
    int acima = 0;
    int abaixo = 0;
    Scanner entrada = new Scanner(System.in);
    double notaAlunos[] = new double[TOTAL_ALUNOS];
        for(int i = 0; i < TOTAL_ALUNOS; i++){
            System.out.println("Informe a nota do "+(i+1)+"º aluno: ");
            notaAlunos[i] = entrada.nextDouble();
            mediaNotas = mediaNotas + notaAlunos[i];
        }
        mediaNotas/=TOTAL_ALUNOS;
        System.out.println("");
        System.out.println("A media das notas é "+mediaNotas);
        for(int i = 0; i < TOTAL_ALUNOS; i++){
            if(notaAlunos[i] > mediaNotas){
                acima++;
            }else{
                abaixo++;
            }
        }
        System.out.println("Os alunos avaliados apresentam "+acima+""
            + " notas acima da média, e "+abaixo+" notas abaixo da media");
    }
}
