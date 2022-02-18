
package AtividadesColaborativas.colaborativa_7;

//Atividade pratica 2, testando o exemplo "TesteIgualdade2"
public class CBBAtividadePratica2 {
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 3: "+frase3);
        System.out.println("Frase 4: "+frase4);
        System.out.println("Frase 3 e Frase 4 possuem a mesma referencia? R: "+(frase3==frase4));
    }
}
