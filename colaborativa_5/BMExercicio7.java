package AtividadesColaborativas.colaborativa_5;

import java.util.Scanner;
public class BMExercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Informe um numero: ");
        x = entrada.nextInt();
        do{
           if(x%2 == 0){
               y=x/2;
               System.out.print(y+"->");
               x=y;
           }else{
               y=(3*x)+1;
               System.out.print(y+"->");
               x=y;
           }
        }while(y != 1);
        System.out.println("");
    }
}
