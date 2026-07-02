import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do terreno: ");
        double comp = scanner.nextDouble();

        System.out.print("Digite o largura do terreno: ");
        double larg = scanner.nextDouble();

        double area = ControleTerrenos.CalcularArea(comp, larg);

        System.out.print("O terreno com " + comp + " m de comprimento e " + larg +
                " m de largura, possui uma área de " + area + " m².");
    }
}
