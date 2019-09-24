package tabelaSimbolos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hashtable {

	public LinkedList<Element>[] arr;
	public int ARR_SIZE;

	public Hashtable(int ARR_SIZE) {
		this.ARR_SIZE = ARR_SIZE;
		
		this.arr = new LinkedList[this.ARR_SIZE];
	}

	private Element getObj(Element element) {
		if (element == null)
			return null;

		int index = Hash.hash(element.getName(), this.ARR_SIZE);
		LinkedList<Element> items = this.arr[index];

		if (items == null)
			return null;

		for (Element item : items) {
			if (item.equals(element))
				return item;
		}

		return null;
	}

	public Element get(Element element) {
		Element item = getObj(element);

		return item;
	}

	public boolean objExists(Element element) {
		if (getObj(element) != null) {
			return true;
		}

		return false;
	}

	public void showAll() {
		
		for (LinkedList<Element> item : this.arr) {
			for (Element obj : item) {
				System.out.print(obj);
			}
		}
	}
	

	public void put(Element element) {
		int index = Hash.hash(element.getName(), ARR_SIZE);
		System.out.println(index);
		LinkedList<Element> items = this.arr[index];

		if (items == null) {
			items = new LinkedList<Element>();

			Element item = element;
			items.add(item);

			this.arr[index] = items;
		} else {
			Element item = element;
			items.add(item);
		}
	}

	public void delete(Element element) {
		int index = Hash.hash(element.getName(), ARR_SIZE);
		LinkedList<Element> items = this.arr[index];

		if (items == null)
			return;

		for (Element item : items) {
			if (item.equals(element)) {
				items.remove(item);
				return;
			}
		}
	}

	public LinkedList<Element>[] getArr() {
		return arr;
	}

	public void setArr(LinkedList<Element>[] arr) {
		this.arr = arr;
	}

	public int getARR_SIZE() {
		return ARR_SIZE;
	}

	public void setARR_SIZE(int aRR_SIZE) {
		ARR_SIZE = aRR_SIZE;
	}
}
