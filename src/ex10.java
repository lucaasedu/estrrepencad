import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int v1, v2, v3, p1, p2, p3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();

        if (v1 >= v2 && v2 >= v3){
            p1 = v1;
            p2 = v2;
            p3 = v3;

        }
        else if (v2 > v1){
            p1 = v2;
            p2 = v1;
            p3 = v3;

        }
        else{
            System.out.println("O terceiro valor, " + v3 + ", é o menor de todos");
        }

    }
}
