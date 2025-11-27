import java.util.Scanner;

public class calculo {
    public static void main(String[] args) {
        String y = "Hoje é um novo dia!";
        System.out.println(y);
       
        System.out.println("A frase possui " + y.length() + " letras.");
        System.out.println("A frase possui a palavra um? " + y.contains("um") + " .");
        System.out.println("A contagem de letras até a palavra dia é de " + y.indexOf("dia") + " letras.");
        System.out.println("Em capslock a frase fica assim: " + y.toUpperCase());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);
        System.out.println(nome + " seu nome possui " + nome.length() + " letras.");
        
        //agora a calculadora
        System.out.println("Digite um número: ");
        int x = scanner.nextInt();
        
        System.out.println("Digite outro número: ");
        int z = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Digite a operação: soma, divisão, subtração, multiplicação: ");
        String operacao = scanner.nextLine();
        
        sum calculadora = new sum();
        int resultado = calculadora.calcular(operacao, x, z);
        
        System.out.println("O resultado é: " + resultado);
        System.out.println("O programa acabou.");
        
        scanner.close(); 
    }

}

class sum {
    
    int calcular (String operacao, int x, int y) {
        
        if (operacao.equals("soma")) {
        return x + y;
        }
        else if (operacao.equals("divisão")) {
            return x / y;
        }
       else if (operacao.equals("subtração")) {
            return x - y;
        }
        else if (operacao.equals("multiplicação")) {
            return x * y;
        }
        else {
            return 0;
        }
        
       }
}
