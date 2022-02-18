package AtividadesColaborativas.colaborativa_7;

//Questão referente a atividade pratica 4 de Chagas,Baruque e Baruque 
public class AppRegistraAluno {
    public static void main(String[] args) {
        
        //Cria 3 objetos RegistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");
        
        System.out.println(ana.getNome());
        
        System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
    }
}
