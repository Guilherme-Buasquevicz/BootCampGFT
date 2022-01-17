package One.DigitalInovation.botcamp;

public class Main {

    public static void main(String[] args) {


        //Calculadora
        Calculadora.Soma(5,4);
        Calculadora.Subtracao(50,30);
        Calculadora.Multiplicacao(7,3);
        Calculadora.Divisao(30,2);
        System.out.println("--------------------------");

        //Mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        System.out.println("--------------------------");

        //Empréstimo
        Emprestimo.calcular(3000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(5000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(10000,10);


    }
}
