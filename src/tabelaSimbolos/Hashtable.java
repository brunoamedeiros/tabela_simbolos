package tabelaSimbolos;

import java.util.LinkedList;

public class Hashtable {

    public static class HTObject {
        public String key;
        public Integer value;
        public Category category;
    }

    public static int ARR_SIZE = 128;
    @SuppressWarnings("unchecked")
	public LinkedList<HTObject>[] arr = new LinkedList[ARR_SIZE];

    public Hashtable() {
        //init vals in array
        for(int i=0; i<ARR_SIZE; i++) {
            arr[i] = null;
        }
    }

    private HTObject getObj(String key) {
        if(key == null)
            return null;

        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if(items == null)
            return null;

        for(HTObject item : items) {
            if(item.key.equals(key))
                return item;
        }

        return null;
    }

    public Integer get(String key) {
        HTObject item = getObj(key);

        if(item == null)
            return null;
        else
            return
            item.value;
    }
    
    public boolean objExists(String key) {
    	if(getObj(key)!=null) {
    		return true;
    	}else {
    		return false;
    	}
    }

    public void put(String key, Integer value, Category cat) {
        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if(items == null) {
            items = new LinkedList<HTObject>();

            HTObject item = new HTObject();
            item.key = key;
            item.value = value;
            item.category = cat;
            items.add(item);

            arr[index] = items;
        }
        else {
            for(HTObject item : items) {
                if(item.key.equals(key)) {
                    item.value = value;
                    return;
                }
            }

            HTObject item = new HTObject();
            item.key = key;
            item.value = value;
            item.category = cat;
            items.add(item);
        }
    }
    
    public void showAll() {
    	for(LinkedList<HTObject> item : arr) {
    		for(HTObject obj: item) {
    			System.out.print("Objeto: "+obj.value+"//");
    		}
    	}
    }

    public void delete(String key) {
        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if(items == null)
            return;

        for(HTObject item : items) {
            if (item.key.equals(key)) {
                items.remove(item);
                return;
            }
        }
    }
}