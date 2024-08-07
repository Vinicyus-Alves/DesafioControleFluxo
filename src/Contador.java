import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        int parametroUm;
        int parametroDois;
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o Primeiro Parametro: ");
        parametroUm = leia.nextInt();
        System.out.println("Insira o Segundo Parametro: ");
        parametroDois = leia.nextInt();

        try {
            Contando(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O Segundo Parametro deve ser maior que o Primeiro Parametro");
            System.out.println("Os parametro não podem ser iguais");
        }

        leia.close();
    }

    static void Contando (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois || parametroUm == parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        for(int indice = 1; indice <= contagem; indice++){
            System.out.println("Imprimindo n° " + indice);
        }
    }
}
