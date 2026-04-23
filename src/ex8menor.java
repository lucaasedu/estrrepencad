import java.util.Scanner;

public class ex8menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salbruto, aliq, impo, saliq;

        System.out.println("Digite o salário bruto: ");
        salbruto = sc.nextDouble();

        if (salbruto <= 2112){
            aliq = 0;
        }
        else if (salbruto <= 2826.65){
            aliq = 7.5;
        }
        else if (salbruto <= 3751.05){
            aliq = 15;
        }
        else if (salbruto <= 4664.68){
            aliq = 22.5;
        }
        else{
            aliq = 27.5;
        }

        impo = salbruto * (aliq/100);
        saliq = salbruto - impo;

        System.out.println("Salário bruto: " + salbruto);
        System.out.println("Aliquota: " + aliq + "%");
        System.out.println("Imposto: " + impo);
        System.out.println("Salário liq: " + saliq);

    }
}
