public class Exercicio08 {
    public static void main(String[] args) {

        double valorVenda = 360;

        // 360 representa 80% do valor original
        double valorOriginal = valorVenda / 0.80;

        // Acrescentando 20% de lucro
        double valorComLucro = valorOriginal * 1.20;

        System.out.println("Valor original: R$ "
                + valorOriginal);

        System.out.println("Valor com 20% de lucro: R$ "
                + valorComLucro);
    }
}