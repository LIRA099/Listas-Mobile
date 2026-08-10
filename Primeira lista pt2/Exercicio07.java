import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura em pés: ");
        double pes = sc.nextDouble();

        double metros = pes * 0.3048;

        System.out.println("Altura em metros: " + metros);

        sc.close();
    }
}