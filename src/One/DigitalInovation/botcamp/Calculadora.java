package One.DigitalInovation.botcamp;

public class Calculadora {

    //ADIÇÃO
    public static void Soma(double n1, double n2){

        double resultAd = n1 + n2;

        System.out.println("A soma de " + n1 + " + " +  n2  + " é = " + resultAd );
    }
    //Subtração
    public static void Subtracao(double n1, double n2){

        double resultSub = n1 - n2;

        System.out.println("A Subtração de " + n1 + " - " +  n2  + " é = " + resultSub );
    }

    //Multiplicação
    public static void Multiplicacao(double n1, double n2) {

        double resultMult = n1 * n2;

        System.out.println("A Multiplicação de " + n1 + " por " +  n2  + " é = " + resultMult );

    }

    //Divisão
    public static void Divisao(double n1, double n2){

        double resultDiv = n1/n2;

        System.out.println("A Divisão de " + n1 + " entre " +  n2  + " é = " + resultDiv );
    }

}
