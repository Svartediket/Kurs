package Collection;

import Collection.Link;

public class Collect <T extends Comparable<T>>{

	private Link<T> first;
	private static int size;
	
	public Collect () {
		this.first = null;
		this.size = 0;
	}
	
	public void add (T obj) {
		if (first == null) 
			addFirst(obj);
		else {
			Link <T> newLink = new Link<>(obj, size);
			Link <T> last = findLast();
			newLink.next = last.next;
			last.next = newLink;
			size++;
		}
	}
	
	private Link<T> findLast() {
		Link<T> current = first;
		while (current.next != null) 
			current = current.next;
		return current;
		
	}
	
	public Link<T> get(int index) {
		if (first != null) {
			Link<T> current = find(index);
			if (current != null)
				return current;
		} return null;
	}

	public Link<T> find (int index) {
		if (first != null && index < size) {
			Link<T> current = first;
			while (current.id != index) {
				current = current.next;
				if (current.next == null) {
					return null;
				}
			} return current;
		}else {
			return null;
		}
	}
	
	public void addFirst (T obj) {
		Link <T> newLink = new Link<>(obj, size);
		newLink.next = first;
		first = newLink;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public Link<T> deleteLast () {
		Link<T> current = first;
		Link<T> previous = first;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		
		if(current == first)
			first = current.next;
		else {
			previous.next = current.next;
		}
		size--;
		return current;
	}
	
	public void showList() {
		Link<T> current = first;
		while (current != null) {
			System.out.println(current.data + " " + current.id );
			current = current.next;
		}
	}
	
	public Link<T> min() {
		Link<T> min = first;
		if (first != null) {
			Link<T> current = first;
			while (current != null) {
				if(min.data.compareTo(current.data) > 0) {
					min = current;
				}
				current = current.next;
				
			}
		}
		else
			min = first;
		return min;
	}

}
