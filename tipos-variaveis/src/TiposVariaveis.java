public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudem a classe Sting que é uma classe que representa uma cadeia de caracteres
        String meuNome = "Bruno";
        System.out.println(meuNome);

        double salarioMinimo = 2500.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =  (short) numeroNormal;

        int numero = 1;

        numero = 2;
        System.out.println(numero);

        //Constante exemplo:
        final double VALOR_DE_PI = 3.15;
        System.out.println(VALOR_DE_PI);

    }
}
