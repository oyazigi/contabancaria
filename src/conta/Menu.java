package conta;
import java.util.Scanner;
import conta.util.Cores;
import conta.model.Conta;
public class Menu {
	public static void sobre() {
		System.out.println(Cores.TEXT_GREEN  + Cores.ANSI_BLACK_BACKGROUND +
				"———————————————————————————————————————————————————————————————————");
		System.out.println("Desenvolvido por: Victor Yazigi Saliba 				   ");
		System.out.println("github.com/oyazigi					    	   ");
		System.out.println("E-mail para contato profissional: victoryazigicontv@gmail.com      ");
		System.out.println("———————————————————————————————————————————————————————————————————");
	}
	public static void mostrarMenu() {
		int op = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(Cores.TEXT_GREEN  + Cores.ANSI_BLACK_BACKGROUND +
					       "___________________________________________________________________");
		System.out.println("                  Banco do Aluno Generation Brasil                 ");
		System.out.println("———————————————————————————————————————————————————————————————————");
		System.out.println("								   ");
		System.out.println("		  1 - Criar Conta				   ");
		System.out.println("		  2 - Listar todas as contas	   		   ");
		System.out.println("		  3 - Buscar conta por Numero			   ");
		System.out.println("		  4 - Atualizar dados da Conta			   ");
		System.out.println("		  5 - Apagar Conta			           ");
		System.out.println("		  6 - Sacar					   ");
		System.out.println("		  7 - Depositar					   ");
		System.out.println("		  8 - Transferir valores entre Contas	           ");
		System.out.println("		  9 - Sair					   ");
		System.out.println("———————————————————————————————————————————————————————————————————");
		System.out.println("Digite a opção desejada:					   " + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
		op = scan.nextInt();
		switch(op) {
		case 1: 
				System.out.println("TESTE");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				sobre();
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
	}
	public static void main(String[] args) {
		Conta a = new Conta(1, 123, 1, "Victor", 10000.0f);
		a.visualizar();
		a.Sacar(12000.0f);
		a.Sacar(5000.0f);
		a.Depositar(85000.0f);
		a.visualizar();
		//mostrarMenu();
	}
}
