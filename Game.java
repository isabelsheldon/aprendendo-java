
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        System.out.println("Bem-vindo ao jogo...");
        System.out.println("Aperte ENTER para começar:");
        scanner.nextLine();
        start();
    }

    public static void start() {
        clear();
        System.out.println("Após anos fugindo sem ao menos saber o motivo de precisar fazer aquilo, você foi capturado");
        System.out.println ("e passou a viver em uma cela com outros dois prisioneiros...");
        System.out.println("Foram exatos três anos vivendo na companhia deles, até que hoje, quando você acordou, eles haviam sumido.");
        System.out.println ("Na verdade, a prisão toda estava em silêncio, e a porta da cela destrancada...");
        System.out.println("Você decidiu sair, e caminhando pelos corredores escuros, encontrou algo pelo caminho... Você:");
        System.out.println();
        System.out.println("1 - Pega um pedaço de papel no chão (parece ter algo escrito)");
        System.out.println("2 - Continua andando pelo corredor escuro");
        System.out.print("Escolha: ");

        //vai selecionar a opção escolhida.
        int op = scanner.nextInt();

        if (op == 1) {
            paper();
        } else if (op == 2) {
            walk();
        } else {
            System.out.println("Opção inválida.");
            start();
        }
    }

    public static void paper() {
        clear();
        System.out.println("Você pegou o papel. Nele tem uma propaganda sobre cremes dentais...");
        System.out.println("Mas ao jogar o papel de volta no chão, algo chama sua atenção...");
        System.out.println("Você encontra um pedaço do uniforme da prisão manchado de sangue");
        System.out.println ("e percebe pequenas gotas que levam até outro corredor...");
        System.out.println("Você:");
        System.out.println();
        System.out.println("1 - Segue o rastro de sangue.");
        System.out.println("2 - Continua caminhando pelo corredor escuro");
        System.out.print("Escolha: ");

        int op2 = scanner.nextInt();

        if (op2 == 1) {
            blood();
        } else if (op2 == 2) {
            walk();
        } else {
            System.out.println("Opção inválida.");
            paper();
        }
    }

    public static void walk() {
        clear();
        System.out.println("Você caminhou por cinco corredores e agora encontrou uma escada de emergência.");
        System.out.println("Você decide descer as escadas para ver se encontra uma saída.");
        System.out.println("O sentimento de liberdade toma conta da sua mente, mas...");
        System.out.println("Você vê uma mão pintada em sangue na parede oposta...");
        System.out.println("Você:");
        System.out.println();
        System.out.println("1 - Desce as escadas correndo, sem sequer olhar para trás...");
        System.out.println("2 - Decide averiguar o sangue, pois pode ser de seus companheiros...");
        System.out.print("Escolha: ");

        int op3 = scanner.nextInt();

        if (op3 == 1) {
            ladder();
        } else if (op3 == 2) {
            blood();
        } else {
            System.out.println("Opção inválida.");
            walk();
        }
    }

    public static void blood() {
        clear();
        System.out.println("Você seguiu os rastros de sangue, mas não encontrou ninguém.");
        System.out.println("É como se cada gota de vida tivesse evaporado de repente...");
        System.out.println("Você olha para o outro lado do corredor e avista a escada de emergência...");
        System.out.println("Você decide descer, procurar uma saída urgentemente...");
        System.out.println();
        System.out.println("Pressione ENTER para descer as escadas...");

        scanner.nextLine(); // limpa o \n que sobrou
        scanner.nextLine(); // agora espera o ENTER real

        ladder();
    }

    public static void ladder() {
        clear();
        System.out.println("Você desceu as escadas, está tudo aberto: sem guardas, prisioneiros, energia...");
        System.out.println("Você sente uma pontada no peito, sua cabeça dói, o mundo ao redor gira...");
        System.out.println("E você sente que sabe o que está acontecendo, mas não lembra o quê...");
        System.out.println("Você olha para a frente e vê algo escrito na parede ao longe, mas você está com muita dor...");
        System.out.println("Você: ");
        System.out.println();
        System.out.println("1 - Vai verificar o que está escrito na parede...");
        System.out.println("2 - A dor é muito forte e você decide se sentar...");
        System.out.println("Escolha: ");

        int op4 = scanner.nextInt();

        if (op4 == 1) {
            verify();
        } else if (op4 == 2) {
            sit();
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void verify() {
        clear();
        System.out.println("Você está com muita dor e cambaleia até a parede perto da porta grande de saída...");
        System.out.println("e na parede está escrito 'NÃO ACORDE'...");
        System.out.println("Você fica confuso e sente mais uma pontada forte no peito...");
        System.out.println("Pressione ENTER para sentar...");

        scanner.nextLine(); // limpa o \n que sobrou
        scanner.nextLine(); // agora espera o ENTER real

        sit();
    }

    public static void sit() {
        clear();
        System.out.println("Você se senta no chão da prisão e a dor piora, a dor no peito te faz ter alucinações...");
        System.out.println("Você sente um choque pelo corpo todo e se retorce, caindo no chão...");
        System.out.println("Uma voz longe te diz 'NÃO ACORDE', e você não entende o que está acontecendo...");
        System.out.println("Você fica sem ar, sua cabeça dói, o mundo ao redor gira...");
        System.out.println("Você acorda desesperado, ofegante, mas não consegue se mexer...");
        System.out.println();
        System.out.println("Médicos te olham com raiva, você está amarrado, e de repente você se lembra de tudo...");
        System.out.println("Essa manhã era o dia da sua execução, depois de três anos no corredor da morte...");
        System.out.println("Mas não deu certo... De novo.");
        System.out.println("------------------------------------------------------------");
        System.out.println("1 - Jogar novamente");
        System.out.println("2 - Encerrar o jogo");
        System.out.print("Escolha: ");

        int op = scanner.nextInt();

        if (op == 1) {
            start();
        } else {
            System.out.println("Fim do jogo.");
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
