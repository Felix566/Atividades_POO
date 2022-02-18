package AtividadesColaborativas.colaborativa_7;

//Questão referente a Atividade pratica 4 de Chagas,Baruque e Baruque
public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;
    
    private static int contadorEstudante;
    
    //retorna o nome do estudante
    public String getNome(){
        return nome;
    }
    
    //define ou altera o nome do estudante
    public void setNome(String temp){
        nome = temp;
    }
    
    //retorna o endereco do estudante
    public String getEndereco(){
        return endereco;
    }
    
    //define ou altera o endereco do estudante
    public void setEndereco(String temp){
        endereco = temp;
    }
    
    //retorna a idade do estudante
    public int getIdade(){
        return idade;
    }
    
    //define ou altera a idade do estudante
    public void setIdade(int temp){
        idade = temp;
    }
    
    //define ou altera as notas
    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }
    public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }

    public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }
    
    //retorna a média do estudante
    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica + notaGeografia + notaPortugues) / 3;
        return resultado;
    }
    
    //retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}
