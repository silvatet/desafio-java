# desafio-java
esse é um desafio criado pela DIO para testar meus conhecimentos de java


Contador Simples em Java
Este é um projeto simples de um contador em Java. O contador pode ser incrementado e seu valor atual pode ser exibido.

Como Usar
Clone o repositório:https://github.com/silvatet/desafio-java.git

bash
Copiar código
git clone https://github.com/seu-usuario/contador-simples.git
cd contador-simples
Compile o código:

bash
Copiar código
javac Contador.java
Execute o programa:

bash
Copiar código
java Contador
Código de Exemplo
java
Copiar código
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



    
Adapte este README conforme necessário para o seu projeto.






