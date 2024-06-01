import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Contagem:");
        System.out.println("Para que a Contagem dê certo");
        System.out.println("O Primeiro parâmetro deve ser MENOR que o segundo");
        System.out.println("----------------------------------------------------------------");

        Scanner terminal = new Scanner(System.in);

        //Colocando o Valor das variáveis que serão utilizadas nos parametros
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        //Tratando as Exceções
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(": O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    /*
    *Função que verifica se o ParametroUm é maior que o parametroDois.
    * Depois Conta de 1 até valor da contagem que é o parametroDois - parametroUm e Imprime na tela
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
