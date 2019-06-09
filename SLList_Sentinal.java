public class SLList_Sentinal {

	public Intnode sentinal; //always gonna be there, as something to occupy space when empty
	private int size_counter;

	// empty list
	public SLList_Sentinal(){
		sentinal = new Intnode(777, null); //the first number 777 means nothing but occupy space
		size_counter = 0;
	}

	//non-empty list
	public SLList_Sentinal(int x) {
		sentinal = new Intnode(777, null); 
		sentinal.next = new Intnode(x,null); 
		size_counter = 1;
	}



	// void addFirst returns nothing but changes 'first'
	public void addFirst(int x){
		//note : sentinal should never be re-assigned
		sentinal.next = new Intnode(x, sentinal.next);
		size_counter += 1;
	}

	public int getFirst(){
		return sentinal.next.item;
	}

	public void addLast(int x){
		Intnode p = sentinal;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new Intnode(x, null);
		size_counter += 1;
	}
	/** getLast is still with error 
	public int getLast(){
		Intnode y = sentinal;
		while (y.next != null) {
			y = y.next;
		}
		if (y.item != 777){
			return y.item;
		}
		return null;		
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
	*/

	/** ------------however, above method is slow ------------------- 
	introduce the Cach method, by adding a special variable that caches the size of the list.
	in every relative operation, this variable would change relatively.*/

	public int sizeFast(){
		return size_counter;
	}

	public static void main(String[] args) {
		// no need to define a null element reference.
		SLList_Sentinal L = new SLList_Sentinal(5);
		L.addFirst(10);
		L.addFirst(12);
		L.addLast(17);
		System.out.println(L.sizeFast());
	}


}