package AtividadesColaborativas.colaborativa_4;

import java.util.Scanner;
public class BMExercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Informe um numero entre 1 e 7: ");
        numero = entrada.nextInt();
        switch(numero){
            case 1:
                System.out.println("SEGUNDA-FEIRA");
                break;
            case 2:
                System.out.println("TERÇA-FEIRA");
                break;
            case 3:
                System.out.println("QUARTA-FEIRA");
                break;
            case 4:
                System.out.println("QUINTA-FEIRA");
                break;
            case 5:
                System.out.println("SEXTA-FEIRA");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Número Inválido.");
                break;
        }
    }
}
