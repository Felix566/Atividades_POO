package AtividadesColaborativas.colaborativa_6;

public class CBBAtividadePratica5 {
    public static void main(String[] args) {
        int i = 0;
        int k = 0;
        String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        System.out.println("Imprimindo usando while: "+"\n");
        while (i < dias.length) {
            System.out.println(dias[i]);
            ++i;
        }
        
        System.out.println("\n"+"Imprimindo usando do-while: ");
        do {
            System.out.println(dias[k]);
            ++k;
        } while (k < dias.length);
        
        System.out.println("\n"+"Imprimindo usando for: ");
        for (int j = 0; j < dias.length; j++) {
            System.out.println(dias[j]);
        }
    }
}
