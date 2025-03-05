package conta;


import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.util.Cores;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaController contas = new ContaController();
		
Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
        String titular;
        
        float saldo, limite, valor;
        
		
		while (true) {
		
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                BANCO DO BRAZIL COM Z                ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Conta                          ");
		System.out.println("            2 - Listar todas as Contas               ");
		System.out.println("            3 - Buscar Conta por Numero              ");
		System.out.println("            4 - Atualizar Dados da Conta             ");
		System.out.println("            5 - Apagar Conta                         ");
		System.out.println("            6 - Sacar                                ");
		System.out.println("            7 - Depositar                            ");
		System.out.println("            8 - Transferir valores entre Contas      ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");

		
		try {
	 		opcao = leia.nextInt();
    	
	 	} catch (InputMismatchException e) {
    	
	    		System.out.println("\nDigite valores inteiros!");
	    		leia.nextLine();
	    		opcao = 0;
	 	}
			
		if (opcao == 9) {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		
		switch (opcao) {
		
		case 1:
			System.out.println("Criar Conta\n\n");

			break;
		case 2:
			System.out.println("Listar todas as Contas\n\n");

			break;
		case 3:
			System.out.println("Consultar dados da Conta - por número\n\n");

			break;
		case 4:
			System.out.println("Atualizar dados da Conta\n\n");

			break;
		case 5:
			System.out.println("Apagar a Conta\n\n");

			break;
		case 6:
			System.out.println("Saque\n\n");

			break;
		case 7:
			System.out.println("Depósito\n\n");

			break;
		case 8:
			System.out.println("Transferência entre Contas\n\n");

			break;
		default:
			System.out.println("\nOpção Inválida!\n");
			break;
			
		}
		}
	}
		
 
	
public static void sobre() {
		// TODO Auto-generated method stub
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: Ana Beatriz Santos");
	System.out.println("Contato - anas2@genstudents.org");
	System.out.println("ghttps://github.com/dsilvasantosgit");
	System.out.println("*********************************************************");
}
}