package tabelaSimbolos;

public class Main {

	static Hashtable hTable = new Hashtable(7);

	public static void main(String[] args) {

		// Inicia a tabela

		Element element1 = new Element("var1", Category.VARIABLE, 0, 0, null);
		Element element2 = new Element("var2", Category.VARIABLE, 1, 0, null);
		Element element3 = new Element("abc", Category.CONSTANT, 0, 2, null);
		Element element4 = new Element("pq", Category.PROCEDURE, 0, 3, null);
		Element element5 = new Element("par1", Category.PARAMETER, 0, 0, 0);

		// Adiciona na tabela
		hTable.put(element1);
		hTable.put(element2);
		hTable.put(element3);
		hTable.put(element4);
		hTable.put(element5);
		
		// Mostra a tabela
//		hTable.showAll();

		// Deleta o elemento 2
//		System.out.println("Buscando elemento var2 antes de deletar: "+(hTable.objExists(element2))+"\n");
//		hTable.delete(element2);

		// Mostra novamente a tabela
		// hTable.showAll();

		// Busca um elemento inexistente
//		System.out.println("Buscando elemento var2 depois de deletar: "+(hTable.objExists(element2))+"\n");

		// Busca elementos existentes
//		System.out.println("Buscando elemento var1: "+(hTable.objExists(element1))+"\n");
//		System.out.println("Buscando elemento abc: "+(hTable.objExists(element3))+"\n");
//		System.out.println("Buscando elemento par1: "+(hTable.objExists(element5))+"\n");
	}
}
