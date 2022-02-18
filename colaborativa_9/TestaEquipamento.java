package AtividadesColaborativas.colaborativa_9;

/*Solução referente a questão 7 do livro Batista Moraes
página 117
*/
public class TestaEquipamento {

    public static void main(String[] args) {
        Equipamento equipamento1 = new Equipamento();
        equipamento1.setTeclado("mecanico");
        equipamento1.setMouse("gamer");
        
        Computador computador1 = new Computador();
        computador1.setMonitor("curvo samsung");
        computador1.setNucleos(8);
        computador1.setTeclado("multilaser");
        computador1.setMouse("Wireless");
        
        /*Solução referente a questão 8 do livro Batista Moraes
        página 117
        */
        System.out.println("=========Informações do equipamento======");
        System.out.println("O teclado é: "+equipamento1.getTeclado());
        System.out.println("O mouse é: "+equipamento1.getMouse());
        System.out.println("");
        System.out.println("=========Informações do computador=======");
        System.out.println("O monitor é: "+computador1.getMonitor());
        System.out.println("Possui "+computador1.getNucleos()+" núcleos");
        System.out.println("O teclado é: "+computador1.getTeclado());
        System.out.println("O mouse é: "+computador1.getMouse());
    }
}
