import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usu, sen;

        System.out.println("Insira o usuário: ");
        usu = sc.nextLine();

        if (usu.equals("admin")){

            System.out.println("Insira a senha: ");
            sen = sc.nextLine();

            if (sen.equals("fiap2026")){
                System.out.println("Acesso liberado");
            }
            else{
                System.out.println("Senha incorreta");

            }
        }
        else{
            System.out.println("Usuário não encontrado");
        }
    }
}
