public class SLList {

	public Intnode first; //this node itself already contains two element, item & next
	private int size_counter;

	public SLList(int x) {
		first = new Intnode(x,null); 
		size_counter = 1;
	}



	// void addFirst returns nothing but changes 'first'
	public void addFirst(int x){
		first = new Intnode(x, first);
		size_counter += 1;
	}

	public int getFirst(){
		return first.item;
	}

	public void addLast(int x){
		Intnode p = first;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new Intnode(x, null);
		size_counter += 1;
	}

	public int getLast(){
		Intnode y = first;
		while (y.next != null) {
			y = y.next;
		}
		return y.item;

	}

	// this is my own method (iteration), different from the lecture
	public int getSize_m(){
		Intnode w = first;
		int counter = 0;
		while (w.next != null){
			counter += 1;
			w = w.next;
		}
		return counter+1;
	}

	/** in the lecture, it mentioned adding a structure below
	which is a , and calculation happens in the private structure
	---------------------this private + public structure is useful-------------------- */
	private static int size(Intnode m){
		if (m.next == null){
			return 1;
		}
		return 1 + size(m.next);
	}
	public int size(){
		return size(first); //why first?????
	}

	/** ------------however, above method is slow ------------------- 
	introduce the Cach method, by adding a special variable that caches the size of the list.
	in every relative operation, this variable would change relatively.*/

	public int sizeFast(){
		return size_counter;
	}

	public static void main(String[] args) {
		// no need to define a null element reference.
		SLList L = new SLList(5);
		L.addFirst(10);
		L.addFirst(12);
		L.addLast(17);
		System.out.println(L.sizeFast());
	}


}