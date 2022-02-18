package AtividadesColaborativas.colaborativa_8;

import java.util.Scanner;

public class CTExercicio2 {

    public static void main(String[] args) {
        CTExercicio1 c = new CTExercicio1("nome_titular", 0);
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int exit = 1;
        while (exit != 0) {
            System.out.println("++++++++++MENU++++++++");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Ver saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sair");
            System.out.println("++++++++++++++++++++++\nEscolha uma das opções: ");
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    CTExercicio1 contaNova = new CTExercicio1("nome_titular", 100.0);
                    break;
                case 2:
                    System.out.println("Seu saldo atual é: "+c.getSaldo());
                    break;
                case 3:
                    if (c.sacar(50) == true) {
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Seu saldo atualizado é: " + c.getSaldo());
                    } else {
                        System.out.println("Saque recusado");
                    }
                    break;
                case 4:
                    c.deposita(100);
                    System.out.println("O saldo atualizado é: " + c.getSaldo());
                    break;
                case 5:
                    exit--;
                    break;
                default:
                    System.out.println("Opção invalida,informe outro");
                    break;
            }
        }
    }
}
