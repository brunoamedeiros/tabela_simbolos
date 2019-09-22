package tabelaSimbolos;

import java.util.LinkedList;

public class MainTeste {

	static Hashtable hTable = new Hashtable();
	static int TABLE_SIZE = 128;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Inicia a tabela
		hTable.arr = new LinkedList[TABLE_SIZE];
		
		//Adiciona na tabela
		hTable.put("var1", 1, Category.VARIABLE);
		hTable.put("var2", 2, Category.VARIABLE);
		hTable.put("abc", 3, Category.CONSTANT);
		hTable.put("pq", 4, Category.PROCEDURE);
		hTable.put("par1", 5, Category.PARAMETER);
		
		//Mostra a tabela
		//hTable.showAll();
		
		//Deleta o elemento 2
		System.out.println("Buscando elemento var2 antes de deletar: "+(hTable.objExists("var2"))+"\n");
		hTable.delete("var2");
		
		//Mostra novamente a tabela
		//hTable.showAll();

		//Busca um elemento inexistente
		System.out.println("Buscando elemento var2 depois de deletar: "+(hTable.objExists("var2"))+"\n");
		
		//Busca elementos existentes
		System.out.println("Buscando elemento var1: "+(hTable.objExists("var1"))+"\n");
		System.out.println("Buscando elemento abc: "+(hTable.objExists("abc"))+"\n");
		System.out.println("Buscando elemento pq: "+(hTable.objExists("pq"))+"\n");
	}
}
