public class processDados {

    public static void main(String[] args){

    int x;
    int y;
    x = 5;
    y = 2 * x;
    System.out.println(x);
    System.out.println(y);

    // processamento de dados e feito por um comando de atribuição de dados
    // variável = expressão (variavel recebe expressão)
    // y = 2 * x

        double B, b, h;
        
        B = 8.0;
        b = 6.0;
        h = 5.0;

        double AreaPerimetro  = (B+b) / 2.0 * h;
        System.out.println(AreaPerimetro);

        //boa pratica, sempre indicar o tipo do número, se a expressão por ponto flutuante 
        // double = .0
        // float = f

        int c, d;
        double resultado;

        c = 5;
        d = 2;

        resultado = (double)c/d;
        // aqui ao declarar o tipo double para os valores já definidos como int acima,
        // e realizdo o processo chamado casting = conversão explicita dos valores 
        System.out.println(resultado);
    

        double e;
        int f;
        e = 5.0;
        f = (int)e;
        System.out.println(f);

    }
    
}
