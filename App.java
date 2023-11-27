import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a medida:do lado do quadrado ");
        double lado = sc.nextDouble();

        sc.close();

        // requisito 2: calcule a area de um quadrado
        // =Lado * Lado
        double area = lado * lado;
        double dobroArea = area * 2;

        // requisito 3: imprimir a área do quadrado
        System.out.println("O dobro da área do quadrado digitado é" + dobroArea);

    }

}