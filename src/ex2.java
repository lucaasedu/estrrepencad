import java.util.Scanner;

public class ex2 {
    public static void main() {
        int diaria;
        double conta, taxa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Total de diárias: ");
        diaria = sc.nextInt();

        if (diaria > 15){
            taxa = 15.50;
        }
        else if (diaria == 15){
            taxa = 36;
        }

        else{
            taxa = 58;
        }

        conta = diaria * (250 + taxa);

        System.out.println("Total da conta: " + conta);
    }
}