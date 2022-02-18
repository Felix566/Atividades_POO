package AtividadesColaborativas.colaborativa_10;

public class AppRegistraAluno {

    public static void main(String[] args) {
        RegistraAluno Ana = new RegistraAluno();

        Ana.setNome("Ana Machado");
        Ana.setEndereco("Av. Brasil, 1000");
        Ana.setIdade(15);

        Ana.setNotaMatematica(9.7);
        Ana.setNotaPortugues(8.2);
        Ana.setNotaGeografia(7.4);

        Ana.imprimir();
    }
}
