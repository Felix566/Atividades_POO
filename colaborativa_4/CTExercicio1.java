package AtividadesColaborativas.colaborativa_4;

import java.util.Scanner;
public class CTExercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        if(idade < 16){
            System.out.println("Desculpe, você não tem idade para votar.");
        }
        else if((idade >= 16) && (idade <= 17) || (idade > 65)){
            System.out.println("O voto é facultativo, não tem obrigacão de votar.");
        }
        else if(idade >= 18 && idade <= 65){
            System.out.println("Seu voto é obrigatório.");
        }
        else{
            System.out.println("Idade inválida");
        } 
    }
}
