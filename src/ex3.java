import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        a = sc.nextDouble();

        if (a == 0){
            System.out.println("Não se trata de uma equação do segundo grau.");
        }

        else {

            System.out.println("Digite o valor de b:");
            b = sc.nextDouble();

            System.out.println("Digite o valor de c:");
            c = sc.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);

            if (delta > 0) {
                x1 = (b * (-1)) + (Math.sqrt(delta)) / (2 * a);
                x2 = (b * (-1)) - (Math.sqrt(delta)) / (2 * a);

                System.out.println("X': " + x1 + " e X'': " + x2);

            }
            else if (delta == 0) {
                x1 = (b * (-1)) + (Math.sqrt(delta)) / (2 * a);
                System.out.println("X': " + x1);
            }
            else {
                System.out.println("Nenhuma raiz real!");
            }
        }
    }
}
