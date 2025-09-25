package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner scanner = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        
        criarContasTeste();		

        while (true) {
            System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT
                    + "**********************************************");
            System.out.println("               BANCO BABADO FORTE             ");
            System.out.println("**********************************************");
            System.out.println("           1 - Criar Conta                    ");
            System.out.println("           2 - Listar todas as Contas         ");
            System.out.println("           3 - Buscar Conta por Número        ");
            System.out.println("           4 - Atualizar Dados da Conta       ");
            System.out.println("           5 - Apagar Conta                   ");
            System.out.println("           6 - Sacar                          ");
            System.out.println("           7 - Depositar                      ");
            System.out.println("           8 - Transferir valores entre Contas");
            System.out.println("           0 - Sair                           ");
            System.out.println("**********************************************");
            System.out.print("Entre com a opção desejada: ");

            try {
            	opcao = scanner.nextInt();
            	scanner.nextLine();
            }catch(InputMismatchException e){
            	opcao = -1;
            	System.out.println("/nDigite um número inteiro entre 0 e 8");
            	scanner.nextLine()
;            }
            
            if (opcao == 0) {
                System.out.println("\nBanco Babado Forte - Barbarizando as suas finanças sempre!");
                sobre();
                scanner.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta \n\n");
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n\n");
                    listarContas();
                    
                    keyPress();
                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");
                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");
                    keyPress();
                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");
                    keyPress();
                    break;
                case 6:
                    System.out.println("Saque\n\n");
                    keyPress();
                    break;
                case 7:
                    System.out.println("Depósito\n\n");
                    keyPress();
                    break;
                case 8:
                    System.out.println("Transfêrencia entre Contas\n\n");
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n********************************************");
        System.out.println("Projeto Desenvolvido por: Nicolly Jesus");
        System.out.println("Contato: nicolly.jesus.nj@gmail.com");
        System.out.println("GitHub:  https://github.com/nicollyjesus");
        System.out.println("********************************************");
    }
    
    public static void keyPress() {
    	System.out.println(Cores.TEXT_RESET + "\n\nPressiona Enter para continuar...");
    	scanner.nextLine();
    }
    
    private static void criarContasTeste() {
    	contaController.cadastrar(new ContaCorrente(1, 123, 1, "Nicolly Jesus", 500000.00f, 0));
    	contaController.cadastrar(new ContaCorrente(2, 456, 2, "Marcia Condarco", 500000.00f, 10));
    }
    
    private static void listarContas() {
    	contaController.listarTodas();
    }
    
}
