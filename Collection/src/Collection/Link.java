package Collection;

public class Link <T> {
	
	public T data;
	public int id;
	public Link<T> next;
	
	public Link (T obj, int id) {
		this.data = obj;
		this.id = id;
		this.next = null;
	}
	
}
