package collectionsJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
         Queue<String> filaClientes = new LinkedList<String>();
         int opcao;
         Scanner receba = new Scanner(System.in);
         do {
        	 System.out.println("------------------------------------------"); 
        	 System.out.println("------Fila de Clientes-------------------");
        	 System.out.println("1- Adicionar cliente na fila..." );
        	 System.out.println("2- Informar clientes na fila...");
        	 System.out.println("3- Chamar um cliente da fila...");
        	 System.out.println("0- Finalizar o programa...");
        	 System.out.println("-------------------------------------------");
        	 System.out.println("\nInforme a opção desejada: ");
        	 
        	 opcao = receba.nextInt();
        	 switch(opcao) {
        	 case 1:
        		 
        		 receba.nextLine();
        		 System.out.println("Informe o nome do cliente que deseja inserir na fila: ");
        		 String nome = receba.nextLine();
        		 if(nome.isEmpty()) {
        			 System.out.println("Nome do cliente não identificado!");
        		 }else {
        			 filaClientes.add(nome);
        			 System.out.println("Cliente "+nome+" adicionado a fila...");
        		 }
        			 break;
        			 
        			 case 2:
        				 receba.nextLine();
        				 System.out.println("Clientes que estão na fila: ");
        				 for(Iterator<String> it = filaClientes.iterator();it.hasNext();) {
        						System.out.println(it.next());
        					}
        					break;
        			 case 3:
        				 receba.nextLine();
        				 if(filaClientes.isEmpty() == true) {
        					 System.out.println("A fila de clientes está vazia!");
        				 }else {
        					 System.out.printf("\nO (a) cliente %s foi chamado(a)!",filaClientes.poll());
        						System.out.println("\nFila: \n");
        						for(Iterator<String> it = filaClientes.iterator();it.hasNext();) {
        							System.out.println(it.next());
        						}
        						System.out.println();
        				 }
        				 break;
        			 case 0:
        				 System.out.println("Programa finalizao!");
        				 break;
        				 default: 
        					 System.out.println("A opção digitada está inválida!!");
        		 }
         }while(opcao != 0);
         

	}

}
