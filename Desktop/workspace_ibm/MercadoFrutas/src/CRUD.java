import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	String op;
	int opcao, escolhafrutas;
	ArrayList<String> frutas = new ArrayList<>();

	do {
		System.out.println("Escolha uma ação \n" 
				+ "1 - Adicionar fruta \n"
				+ "2 - Mostra frutas cadastrada \n"
				+ "3 - Altera Fruta \n"
				+ "4 - Excluir frutas \n"
				+ "0 - Sair");
		opcao = teclado.nextInt(); 
		  switch(opcao) {
		  case 1:
			  System.out.println("Qual o nome da fruta?");
			  op = teclado.next();
			  frutas.add(op);
			  break;
		  case 2:  
			  System.out.println("Frutas Disponiveis");
			  System.out.println(frutas);
			  break;
		  case 3:
			  System.out.println("Qual o numero da fruta que vc deseja modificar? ");
			  escolhafrutas = teclado.nextInt();
			  op = teclado.next();
			  frutas.set(escolhafrutas, op);
			  break;
		  case 4:
			  System.out.println("Qual fruta deseja excluir?");
			  frutas.remove(teclado.nextInt());
			  break;
		  case 0: 
		  	  System.out.println("Volte sempre");
		  	  break;
		  	  default: 
		  		System.out.println("Opção invalida");			  
		  }
	  } while(opcao != 0);
	teclado.close();
	}
}
