import java.util.Scanner;

public class entradaDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();

        int y;
        y = sc.nextInt();

        double z;
        z = sc.nextDouble();

        System.out.printf("escrita: " + x);
        System.out.println();
        System.out.printf("numero: " + y);
        System.out.println();
        System.out.printf("ponto flutuante: " + z);

        sc.close();

    }
}

// import java.util.Scanner; importa a classe scanner

// Scanner sc = new Scanner (System.in); cria uma variavel chamada scanner (sc)
// (new) cria um objeto novo na memória, (System.in) parâmetro que diz aonde o
// scanner vai ler

// sc.next(); lê o conteudo no terminal e armazena na variavel

// sc.close(); fecha o Scanner

// sysout + control + espaço