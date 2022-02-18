package AtividadesColaborativas.colaborativa_6;

import java.util.Scanner;

public class CBBAtividadePratica6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int valores[] = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o "+(i+1)+"º numero: ");
            valores[i] = entrada.nextInt();
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println("Os numeros inseridos foram: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]+" ");
        }
        System.out.println("");
        System.out.println(" E o maior valor informado foi "+maior);
    }
}
