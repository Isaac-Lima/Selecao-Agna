/* 4 - Implementar um programa chamado TesteEstudante que realiza as seguintes operações:
- Criar um estudante;
- Atribuir os valores 2004001, "Maria Silva" e "F" para as variáveis de instância matrícula, nome e sexo, respectivamente;
- preencher o array de notas com os valores 7.0; 8.2; 6.0; 5.5;
- exibir na tela os valores de todas as propriedades do estudante;
- exibir na tela os valores de todas as notas do estudante.*/

public class TesteEstudante {
    private int matricula;
    private String nome;
    private char sexo;
    private double[] notas;

    // Construtor
    public TesteEstudante(int matricula, String nome, char sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.notas = new double[4];
    }

    // Método para preencher as notas do estudante
    public void preencherNotas(double nota1, double nota2, double nota3, double nota4) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
    }

    // Método para exibir informações do estudante
    public void exibirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
    }

    // Método para exibir as notas do estudante
    public void exibirNotas() {
        System.out.println("Notas do estudante:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
    }

    // Método main para testar a classe Estudante
    public static void main(String[] args) {
        TesteEstudante estudante = new TesteEstudante(2004001, "Maria Silva", 'F');
        estudante.preencherNotas(7.0, 8.2, 6.0, 5.5);

        System.out.println("Informações do estudante:");
        estudante.exibirInformacoes();

        System.out.println();

        estudante.exibirNotas();
    }
}



