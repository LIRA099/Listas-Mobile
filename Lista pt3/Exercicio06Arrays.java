public class Exercicio06Arrays {
    public static void main(String[] args) {

        String[][] compras = {
                {"Detergente", "Arroz"},
                {"Sabão", "Feijão"},
                {"Desinfetante", "Macarrão"},
                {"Esponja", "Leite"},
                {"Água sanitária", "Pão"}
        };

        System.out.println(
                "LIMPEZA              | ALIMENTAÇÃO"
        );

        System.out.println(
                "-------------------------------------"
        );

        for (String[] item : compras) {

            System.out.printf(
                    "%-20s | %s%n",
                    item[0],
                    item[1]
            );
        }
    }
}