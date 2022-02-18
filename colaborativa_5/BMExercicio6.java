package AtividadesColaborativas.colaborativa_5;

import java.util.Scanner;
public class BMExercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int status = 1;
        int numero;
        while(status != 0){
            System.out.println("");
            System.out.println("Informe um numero entre 1 e 7: ");
            numero = entrada.nextInt();
                if(numero != 0){
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
                }else{
                    System.out.println("Encerrando programa...");
                    status++;
                    break;
                }
        }
    }
}
