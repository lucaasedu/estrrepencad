import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        int v1, v2, v3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();

        if (v1 == v2 || v2 == v3 || v1 == v3 ){
            System.out.println("Existem números repetidos! Escreva números diferentes.");
        }

        else if (v1 < v2 && v1 < v3 ){
            System.out.println("O primeiro valor, " + v1 + ", é o menor de todos");
        }
        else if (v1 > v2 && v2 < v3 ){
            System.out.println("O segundo valor, " + v2 + ", é o menor de todos");
        }
        else{
            System.out.println("O terceiro valor, " + v3 + ", é o menor de todos");
        }

    }
}
