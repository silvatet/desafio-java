    import java.util.InputMismatchException;
    import java.util.Scanner;
    
    public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
    
            int parametroUm = lerInteiro("Digite o primeiro parâmetro: ", terminal);
            int parametroDois = lerInteiro("Digite o segundo parâmetro: ", terminal);
    
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    
        static int lerInteiro(String mensagem, Scanner scanner) {
            while (true) {
                try {
                    System.out.print(mensagem);
                    return scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erro: entrada inválida. Por favor, digite um número inteiro.");
                    scanner.next(); // descartar entrada inválida
                }
            }
        }
    
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
    
            int contagem = parametroDois - parametroUm + 1;
    
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + (parametroUm + i - 1));
            }
        }
    }
    
    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }






