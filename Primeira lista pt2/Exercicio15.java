public class Exercicio15 {
    public static void main(String[] args) {

        double total = 0;

        for (int dia = 1; dia <= 12; dia++) {

            double deposito = dia * 2;

            total += deposito;
        }

        System.out.println(
                "Total acumulado: R$ " + total
        );
    }
}