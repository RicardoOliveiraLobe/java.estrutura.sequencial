
import java.util.Scanner;

public class entradaDadosd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Para ler um texto ATÉ A QUEBRA DE LINHA
        String s1, s2, s3;
        int x;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

//s1 = sc.nextLine(); função para ler até a quebra de linha

//quebra de linha pendente, quando voce usa o enter para uma função sc.next sem o Line, a proxima função sc.nextLine consome 
// a quebra de linha anterior 