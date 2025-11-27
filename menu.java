import java.util.Scanner;

public class menu {
    
    //funçao limpar tela
    
    public static void LimparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        
        System.out.println("   MENU DE CADASTRO");
        System.out.println("--------------------------------"); 
        System.out.println(" ");
        
        //Menu principal
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        
        System.out.println("Digite sua cidade: ");
        String city = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        LimparTela();
        
        //Reinicia o menu de cadastro para confirmaçao de dados
        
        System.out.println("   MENU DE CADASTRO");
        System.out.println("--------------------------------"); 
        System.out.println(" ");
        
        System.out.println("Seu nome é: " + name);
        
        System.out.println("Confirme a cidade ou atualize: ");
        String city2 = scanner.nextLine();
        city = city2;
        
        System.out.println("Sua idade é: " + age);
        
        //Agora o cadastro atualizado e dizendo se a pessoa é maior de idade
        
       String maioridade;
        
        if (age >=18) {
            maioridade = "Você tem " + age + " anos e é maior de idade.";
        }
        else {
            maioridade = "Você tem " + age + " anos e é menor de idade.";
        }
        
        LimparTela();
      
        //Menu final
      
        System.out.println("   MENU DE CADASTRO");
        System.out.println("--------------------------------"); 
        System.out.println(" ");
        
        System.out.println("Seu nome é: " + name);
        
        System.out.println("Sua cidade é: " + city2);
        
        System.out.println(maioridade);
        
        scanner.close();
        
    }
}
