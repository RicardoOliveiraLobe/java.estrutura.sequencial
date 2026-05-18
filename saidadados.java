import java.util.Locale;

public class saidadados {

    public static void main(String[] args) {

        int y = 40;
        double z = 10.678541454;
        String nome = "Maria";
        int idade = 31;
        Double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        System.out.print("inicio ");
        System.out.println("das aulas ");
        System.out.println(y);
        System.out.println(z);
        System.out.printf("%.2f%n", z);
        System.out.printf("%.4f%n", z);
        Locale.setDefault(Locale.US);        
        System.out.printf("%.4f%n", z);

        //concatenação println
        System.out.println("RESULTADO = " + z + " METROS");

        //concatenação printf
        System.out.printf("RESULTADO = %.2f METROS%n", z);
        //O marcador (no caso %.2f) é substituido pelo valor da variável (no caso z)  
        


    }
}

//print - sem quebra de linha
//println - com quebra de linha
//printf - formatação de texto

//%.2f - formatação de número decimal com 2 casas decimais
//%n - quebra de linha

//locale.setDefault(Locale.US) - define o local para os Estados Unidos, afeta a formatação
//  de números decimais usando ponto 

// marcadores %d = inteiro, %s = string, %f = número decimal, %.2f = número decimal com
//  2 casas decimais, %n = quebra de linha
