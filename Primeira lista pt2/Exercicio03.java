import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair'): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a data de vencimento (dd/MM/yyyy): ");
            String data = sc.nextLine();

            LocalDate vencimento = LocalDate.parse(data, formato);
            LocalDate hoje = LocalDate.now();

            if (vencimento.isBefore(hoje)) {
                System.out.println("O produto está vencido.");
            } else {
                System.out.println("O produto não está vencido.");
            }
        }

        sc.close();
    }
}