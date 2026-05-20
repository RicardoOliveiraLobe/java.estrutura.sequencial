import java.util.Scanner;
//import java.util.Locale;

public class entradaDados {

    public static void main(String[] args) {

        // Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        int y;
        y = sc.nextInt();

        double z;
        z = sc.nextDouble();
        char w;
        w = sc.next().charAt(0);

        //Permite ler variaveis na mesma linha
        System.out.println("voce digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

        sc.close();

    }
}

// import java.util.Scanner; importa a classe scanner
// Scanner sc = new Scanner (System.in); cria uma variavel chamada scanner (sc)
// (new) cria um objeto novo na memória, (System.in) parâmetro que diz aonde o
// scanner vai ler
// sc.next(); lê o conteudo no terminal e armazena na variavel
// sc.close(); fecha o Scanner
// x- sc.next().charAt(0); .charAt(0) pega o primeiro caracter da string
// obs:sysout + control + espaço para print