/* 1 - Escreva um método em Java ou função SQL que recebe uma data como parâmetro
e retorne uma String com o nome Mês. Ex: Se informar a data 15/01/2024
a função deve retornar Janeiro.*/

import java.text.SimpleDateFormat; // Importa a classe SimpleDateFormat para formatar datas
import java.util.Calendar; // Importa a classe Calendar para manipulação de datas
import java.util.Date; // Importa a classe Date para representar datas específicas
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Questao_01 {

    // Método para obter o nome do mês a partir de uma data
    public static String getMonthName(Date date) {
        Calendar calendar = Calendar.getInstance(); // Obtém uma instância do calendário
        calendar.setTime(date); // Define a data do calendário para a data fornecida
        int monthNumber = calendar.get(Calendar.MONTH); // Obtém o número do mês
        String[] monthNames = { // Array com os nomes dos meses
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return monthNames[monthNumber]; // Retorna o nome do mês correspondente ao número
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        System.out.println("Digite a data (no formato dd/MM/yyyy):"); // Solicita a data ao usuário
        String dateString = scanner.nextLine(); // Lê a data digitada pelo usuário

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
        try {
            Date date = dateFormat.parse(dateString); // Converte a string de data para um objeto Date
            String monthName = getMonthName(date); // Obtém o nome do mês
            System.out.println("O nome do mês é: " + monthName); // Exibe o nome do mês
        } catch (Exception e) { // Trata exceções caso ocorra algum erro na conversão da data
            System.out.println("Formato de data inválido. Certifique-se de digitar no formato correto (dd/MM/yyyy).");
        } finally { // Fecha o Scanner após o uso, mesmo se ocorrer uma exceção
            scanner.close();
        }
    }
}
