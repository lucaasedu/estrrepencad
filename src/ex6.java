import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turno;

        System.out.println("Digite seu turno: ");
        turno = sc.nextLine();

        if (turno.equals("manhã")){
            System.out.println("8h às 12h");
        }
        else if (turno.equals("tarde")){
            System.out.println("13h ás 18h");
        }
        else if (turno.equals("noite")){
            System.out.println("17h ás 23h");
        }
        else{
            System.out.println("Turno inválido");
        }


    }
}
