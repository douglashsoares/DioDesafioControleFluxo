import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        //Colocando o Valor dos parametros
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        //Tratando as Excessões
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(": O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    /*
    *Função que verifica se o Parametro Um é maior que o dois.
    * Depois Conta de 1 até valor da contagem que é o parametroDois - parametroDois e Imprime na tela
    */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }
}
