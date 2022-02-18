package AtividadesColaborativas.colaborativa_12.CTExercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class appConta {

    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial();
        ContaPoupanca cp = new ContaPoupanca();
        ArrayList<Conta> listaContas = new ArrayList<>();
        int option = 1;
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Informe um numero inteiro para:\n1.Criar uma conta\n2.Para ver o saldo\n3.Para sacar\n4.Para depositar\n5.Para finalizar");
            option = ler.nextInt();
            ler.nextLine();
            switch (option) {
                case 1:
                    numero = numero + 1;
                    System.out.println("Informe o tipo de conta:\n2.Especial\n3.Poupança");
                    int tipo = ler.nextInt();
                    if (tipo == 3) {
                        ler.nextLine();
                        System.out.println("Informe seu nome:");
                        String nomeInformado = ler.nextLine();
                        System.out.println("Informe seu CPF");
                        String cpf = ler.nextLine();
                        Cliente cl = new Cliente(nomeInformado, cpf);
                        System.out.println("Informe um saldo inicial");
                        double saldoInicial = ler.nextDouble();
                        ContaPoupanca contaPoup = new ContaPoupanca(numero, cl);
                        listaContas.add(contaPoup);
                        System.out.println("Conta " + numero + " criada");
                    }
                    if (tipo == 2) {
                        ler.nextLine();
                        System.out.println("Informe seu nome:");
                        String nomeInformado = ler.nextLine();
                        System.out.println("Informe seu CPF");
                        String cpf = ler.nextLine();
                        Cliente cl1 = new Cliente(nomeInformado, cpf);
                        System.out.println("Informe um limite");
                        double limite = ler.nextDouble();
                        ContaEspecial contaEsp = new ContaEspecial(numero, cl1, limite);
                        listaContas.add(contaEsp);
                        System.out.println("Conta " + numero + " criada");

                    }
                    break;
                case 2:
                    System.out.println("Informe o número da conta que quer ver o saldo:");
                    int n = ler.nextInt();
                    for (int k = 0; k < listaContas.size(); k++) {
                        if (listaContas.get(k).getNumero() == n) {
                            System.out.println(listaContas.get(k).getSaldo());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Informe o número da conta que quer sacar:");
                    n = ler.nextInt();

                    for (int k = 0; k < listaContas.size(); k++) {
                        if (listaContas.get(k).getNumero() == n) {

                            System.out.println("Informe o valor a ser sacado:");
                            double valorSaque = ler.nextDouble();
                            listaContas.get(k).sacar(valorSaque, listaContas.get(k));

                        }
                    }
                    break;
                case 4:
                    System.out.println("Informe o número da conta que quer depositar:");
                    n = ler.nextInt();
                    for (int k = 0; k < listaContas.size(); k++) {
                        if (listaContas.get(k).getNumero() == n) {
                            System.out.println("Informe o valor a ser depositado");
                            double valorDepositar = ler.nextDouble();
                            listaContas.get(k).depositar(valorDepositar, listaContas.get(k));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Programa encerrado");
            }
        } while (option != 5);

    }
}
