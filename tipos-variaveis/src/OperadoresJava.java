public class OperadoresJava{
    public static void main(String[] args) {

        //Operadores aritmeticos

        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);
        // String concatenacao = "?";
        // System.out.println(concatenacao);
        // concatenacao = 1+1+1+"1";
        // System.out.println();
        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);
        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);
        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);
        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);

        // int numero = 5;
        // numero = - numero;
        // System.out.println(numero);

        // numero = numero * -1;

        // System.out.println(numero);

        // int numero = 5;
        //x repeticao

        // System.out.println(++numero);
        // System.out.println(numero);
        // System.out.println(--numero);
        // System.out.println(numero--);
        // System.out.println(numero);

        // boolean variavel = true;

        // System.out.println(variavel);

        // variavel = !variavel;

        // System.out.println(variavel);

        //Operador ternario

        // int numero = 5;
        // int a, b;
        // a = 5;
        // b = 6;


        // if(a == b ) {
        //     resultado = "Verdadeiro";
        // } else {
        //     resultado = "falso";
        // }
        // int resultado = a == b ? 1 : 0;
        // System.out.println(resultado);

        //Operadores relacionais

        // String nome1 = "Bruno";
        // String nome2 = new String("Bruno");

        // System.out.println(nome1.equals(nome2));

        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if(numero1 < numero2){
        //     System.out.println("A nossa condição é verdadeira");
        // }

        // System.out.println("numero1 é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;
        // System.out.println("numero1 é diferente de numeroDois? " + simNao);

        // simNao = numero1 > numero2;
        // System.out.println("numero1 é maior que numeroDois? " + simNao);

        // Operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if(condicao1 || condicao2){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

    }
}