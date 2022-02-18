package AtividadesColaborativas.colaborativa_10;

public class RegistraAluno {

    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public static int getContadorEstudante() {
        return contadorEstudante;
    }

    public static void setContadorEstudante(int contadorEstudante) {
        RegistraAluno.contadorEstudante = contadorEstudante;
    }

    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
        return resultado;
    }

    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Idade: " + getIdade());
    }

    public void imprimir(double mNota, double pNota, double gNota) {
        System.out.println("Nome: " + getNome());
        System.out.println("Nota Matemática: " + mNota);
        System.out.println("Nota Português: " + pNota);
        System.out.println("Nota Geografia: " + gNota);
    }
}
