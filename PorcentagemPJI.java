import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double larguraFix = 1512;
        double alturaFix = 982;
        double larguraIns = 0;
        double alturaIns = 0;
        double porcentagemLargura = 0;
        double porcentagemAltura = 0;
        double larguraCalc = 0;
        double alturaCalc = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        larguraIns = scanner.nextInt();
        System.out.println("Digite a altura: ");
        alturaIns = scanner.nextInt();

        if (larguraFix == 1512){
            porcentagemLargura = 100;
        } else if (alturaFix == 982){
            porcentagemAltura = 100;
        }

        porcentagemLargura = (larguraIns * 100) / 1512;
        porcentagemAltura = (alturaIns * 100) / 982;

        System.out.println("Porcentagem de largura: " + porcentagemLargura + "%");
        System.out.println("Porcentagem de altura: " + porcentagemAltura+ "%");
    }
}
