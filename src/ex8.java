import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salbruto, aliq, impo, saliq;

        System.out.println("Digite o salário bruto: ");
        salbruto = sc.nextDouble();

        if (salbruto <=  2112){
            aliq = 0;
            impo = 0;
            saliq = salbruto;

            System.out.println("Salário bruto: " + salbruto);
            System.out.println("Salário liq: " + saliq);
            System.out.println("Aliquota" + aliq);
            System.out.println("Imposto" + impo);

        }
        else if(salbruto > 2112){
            if (salbruto <= 2826.65){
                aliq = 0.075;
                impo = salbruto * aliq;
                saliq = salbruto - impo;

                System.out.println("Salário bruto: " + salbruto);
                System.out.println("Salário liq: " + saliq);
                System.out.println("Aliquota" + aliq);
                System.out.println("Imposto" + impo);
            }
            if (salbruto > 2826.65){
                if (salbruto <=  3751.05){
                    aliq = 0.15;
                    impo = salbruto * aliq;
                    saliq = salbruto - impo;

                    System.out.println("Salário bruto: " + salbruto);
                    System.out.println("Salário liq: " + saliq);
                    System.out.println("Aliquota" + aliq);
                    System.out.println("Imposto" + impo);
                }
                if (salbruto > 3751.05){
                    if (salbruto <=  4664.68){
                        aliq = 0.225;
                        impo = salbruto * aliq;
                        saliq = salbruto - impo;

                        System.out.println("Salário bruto: " + salbruto);
                        System.out.println("Salário liq: " + saliq);
                        System.out.println("Aliquota" + aliq);
                        System.out.println("Imposto" + impo);
                    }
                    else{
                        aliq = 0.275;
                        impo = salbruto * aliq;
                        saliq = salbruto - impo;

                        System.out.println("Salário bruto: " + salbruto);
                        System.out.println("Salário liq: " + saliq);
                        System.out.println("Aliquota" + aliq);
                        System.out.println("Imposto" + impo);
                    }

                }

            }

        }

    }
}
