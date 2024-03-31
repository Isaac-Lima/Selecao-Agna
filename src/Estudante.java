/* 3 - Implementar uma classe Estudante com as seguintes propriedades:
- matrícula (int)
- nome (String)
- sexo (char)
- um array chamado 'notas' com 4 posições(double[4]) sendo uma posição para cada nota parcial.

A classe deve ter as seguintes operaçõe:
- void exibir() para mostrar os dados do Estudante
- void atribuirNota(int numProva, double nota) coloca o array na posição numProva-1;
- double lerNota(int numProva) procura no array e retorna a nota existente na posição numProva-1.*/

import java.util.Scanner;

public class Estudante {
    private int matricula;
    private String nome;
    private char sexo;
    private double[] notas = new double[4]; // Array de notas com 4 posições

    // Método para exibir os dados do estudante
    public void exibir() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Prova " + (i + 1) + ": " + notas[i]);
        }
    }

    // Método para atribuir nota a uma prova específica
    public void atribuirNota(int numProva, double nota) {
        if (numProva >= 1 && numProva <= 4) {
            notas[numProva - 1] = nota;
        } else {
            System.out.println("Número de prova inválido. Insira um número de prova entre 1 e 4.");
        }
    }

    // Método para ler a nota de uma prova específica
    public double lerNota(int numProva) {
        if (numProva >= 1 && numProva <= 4) {
            return notas[numProva - 1];
        } else {
            System.out.println("Número de prova inválido. Insira um número de prova entre 1 e 4.");
            return -1; // Retorna -1 se o número de prova for inválido
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        // Solicitação dos dados do estudante
        System.out.print("Digite a matrícula: ");
        estudante.matricula = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o nome: ");
        estudante.nome = scanner.nextLine();

        System.out.print("Digite o sexo: ");
        estudante.sexo = scanner.nextLine().charAt(0);

        // Atribuição das notas
        for (int numProva = 1; numProva <= 4; numProva++) {
            System.out.print("Digite a nota da prova " + numProva + ": ");
            double nota = scanner.nextDouble();
            estudante.atribuirNota(numProva, nota);
        }

        // Exibição dos dados do estudante
        estudante.exibir();

        scanner.close();
    }
}

