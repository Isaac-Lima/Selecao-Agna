/* 2 - Escreva um método em Java ou função SQL que recebe uma data como parâmetro
e retorne uma String com o último dia do mês. Ex: Se informar a data 15/01/2024
a função deve retornar 31/01/2024.*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Questao_02 {
    public static String getLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Define o dia do mês como o último dia do mês
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        // Formata a data para o formato dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(calendar.getTime()); // Retorna a data formatada como uma string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data (no formato dd/MM/yyyy):");
        String dateString = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(dateString);
            String lastDayOfMonth = getLastDayOfMonth(date);
            System.out.println("O último dia do mês é: " + lastDayOfMonth);
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de digitar no formato correto (dd/MM/yyyy).");
        } finally {
            scanner.close();
        }
    }
}

