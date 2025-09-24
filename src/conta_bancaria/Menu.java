package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;

		// Instanciar Objetos da Classe Conta
		
		Conta c1 = new Conta(1, 123, 1, "Nicolly Jesus", 500000.00f);
		
		System.out.println("O Saldo da conta é: " + c1.getSaldo());
		
		c1.setSaldo(600000.00f);
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 100000000.00f, 10000000f ); 
		cc1.visualizar();
		System.out.println("saque 1: " + cc1.sacar(200000000.00f));
		cc1.visualizar();
		System.out.println("saque 2: " +cc1.sacar(2000.00f));
		cc1.visualizar();
		
		cc1.depositar(5000.00f);
		cc1.visualizar();
		
		System.out.println("O Saldo atualizado da conta é: " + c1.getSaldo());
		
		while (true) {
			
			System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND_BRIGHT +"**************	");
			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("               BANCO BABADO FORTE             ");
			System.out.println("                                              ");
			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("           1 - Criar Conta                    ");
			System.out.println("           2 - Listar todas as Contas         ");
			System.out.println("           3 - Buscar Conta por Número        ");
			System.out.println("           4 - Atualizar Dados da Conta       ");
			System.out.println("           5 - Apagar Conta                   ");
			System.out.println("           6 - Sacar                          ");
			System.out.println("           7 - Depositar                      ");
			System.out.println("           8 - Transferir valores entre Contas");
			System.out.println("           0 - Sair                           ");
			System.out.println("                                              ");
			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("Entre com a opção desejada:                   ");
			System.out.println("                                              ");
			
			opcao = scanner.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nBanco Babado Forte - Barbarizando as suas finanças sempre!");
				sobre();
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar Conta \n\n");
				
				break;
			case 2: System.out.println("Listar todas as Contas\n\n");	
			
			    break;
			case 3: System.out.println("Consultar dados da Conta - por número\n\n");	
			
		        break;
		    case 4: System.out.println("Atualizar dados da Conta\n\n");
	
	           break;
	        case 5: System.out.println("Apagar a Conta\n\n");	
	        
	           break;
	        case 6: System.out.println("Saque\n\n");
	        
	           break;
	        case 7: System.out.println("Depósito\n\n");
	        
	           break;
	        case 8: System.out.println("Transfêrencia entre Contas\n\n");
	        
	        	break;
	        default:
	        	System.out.println("\nOpção Inválida!\n");
	        	break;
		 }
	}
}	
			
			public static void sobre() {
				System.out.println("\n********************************************");
				System.out.println("Projeto Desenvolvido por: Nicolly Jesus");
				System.out.println("Nicolly Jesus - nicolly.jesus.nj@gmail.com");
				System.out.println("https://github.com/nicollyjesus?tab=repositories");
				System.out.println("***************************************************");
		}
}		
