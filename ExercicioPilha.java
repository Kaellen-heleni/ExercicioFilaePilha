package collectionsJava;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		int opcao;
		Scanner receba = new Scanner(System.in);
		
		  do {
	        	 System.out.println("------------------------------------------"); 
	        	 System.out.println("------Pilha de Livros-------------------");
	        	 System.out.println("1- Adicionar livro na pilha..." );
	        	 System.out.println("2- Listar todos os livros que estão na pilha...");
	        	 System.out.println("3- Retirar livro da pilha...");
	        	 System.out.println("0- Sair do programa...");
	        	 System.out.println("-------------------------------------------");
	        	 System.out.println("\nInforme a opção desejada: ");
	        	 
	        	 opcao = receba.nextInt();
	        	 switch(opcao){
	        	 case 1: 
	        		 receba.nextLine();
	        		 System.out.println("Informe o nome do livro que deseja adicionar na pilha: ");
	        		 String livro = receba.nextLine();
	        		 if(livro.isEmpty()==true) {
	        			 System.out.println("A pilha de livros está vazia!");
	        		 }else {
	        			 pilhaLivros.push(livro);
	        			 System.out.println("O livro "+livro+" foi adicionado a pilha...");
	        		 }
	        			 break;
	        	 case 2:
	        		 receba.nextLine();
	        		 System.out.println("Livros que estão na pilha: ");
	        		 for(Iterator<String> it = pilhaLivros.iterator();it.hasNext();) {
 						System.out.println(it.next());
 					}
 					break;
	        	 case 3:
	        		 receba.nextLine();
	        		 if(pilhaLivros.isEmpty() == true) {
    					 System.out.println("A pilha de livros está vazia!");
    				 }else {
    					 System.out.printf("\nO livro %s foi removido da pilha!",pilhaLivros.pop());
    						System.out.println("\nFila: \n");
    						for(Iterator<String> it = pilhaLivros.iterator();it.hasNext();) {
    							System.out.println(it.next());
    						}
    						System.out.println();
    				 }
    				 break;
	        	 case 0:
	        		 System.out.println("Saindo do programa!");
	        		 break;
	        		 default: 
	        			 System.out.println("Opção inválida!");
	        	 }
	        	 }while (opcao != 0);
		  }
}