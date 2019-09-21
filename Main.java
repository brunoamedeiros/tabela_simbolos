package tabelaSimbolos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		/**
		 * Criar 10 elementos
		 * Nome, Categoria do Nome, Nível, geralA, geralB
		 */
		Element element1 = new Element("var1", Category.VARIABLE, 0, 0, null);
		Element element2 = new Element("var2", Category.VARIABLE, 1, 0, null);
		Element element3 = new Element("abc", Category.CONSTANT, 0, 2, null);
		Element element4 = new Element("pq", Category.PROCEDURE, 0, 3, null);
		Element element5 = new Element("par1", Category.PARAMETER, 0, 0, 0);
		
		/**
		 * Adicionar os elementos em uma lista
		 */
		ArrayList<Element> elements = new ArrayList<Element>();
		elements.add(element1);
		elements.add(element2);
		elements.add(element3);
		elements.add(element4);
		elements.add(element5);
		
		/**
		 * Criar a tabela de símbolos
		 */
		HashMap<Element, Integer> hashTable = new HashMap<Element, Integer>();

		/**
		 * Descobre o próximo númeo primo de acordo com o tamanha da lista de elementos
		 */
		long tableSize = Prime.nextPrime(elements.size());

		/**
		 * Insere os 10 elementos
		 */
		for (Element element : elements) {
			int hashIndex = Hash.hash(element.getName(), tableSize);
			
			hashTable.putIfAbsent(element, hashIndex);
		}
		
		// Mostra na tela
		System.out.println("Tabela com os 5 elementos");
		System.out.println(hashTable);
		
//		/**
//		 * Altera os 5 elementos
//		 */
////		System.out.println(hashTable.replace(key, oldValue, newValue));
////		System.out.println(hashTable.replace(key, oldValue, newValue));
////		System.out.println(hashTable.replace(key, oldValue, newValue));
////		System.out.println(hashTable.replace(key, oldValue, newValue));
////		System.out.println(hashTable.replace(key, oldValue, newValue));
//
		// Mostra na tela
		System.out.println(hashTable);
				
		/**
		 * Remove 3 elementos
		 */
		hashTable.entrySet().removeIf(entry -> entry.getKey().equals(element2));

		// Mostra na tela
		System.out.println("Ao remover o elemento 2 da tabela:");
		System.out.println(hashTable);
		
		/**
		 * Busca 1 elemento inexistente na tabela
		 */
		System.out.println("Resultado ao procurar o elemento 2 da tabela: "+hashTable.values().contains(element2));
		
		/**
		 * Busca 3 elementos existentes na tabela
		 */
		System.out.println("Resultado ao procurar o elemento 1 da tabela: "+hashTable.containsKey(element1));
		System.out.println("Resultado ao procurar o elemento 3 da tabela: " +hashTable.containsKey(element3));
		System.out.println("Resultado ao procurar o elemento 5 da tabela: " +hashTable.containsKey(element5));
	}

}
