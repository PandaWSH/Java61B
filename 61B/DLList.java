public class DLList<LochNess> {
	private class Somenode{
		public LochNess item;
		public Somenode next;

		public Somenode(LochNess i, Somenode n){
			item = i;
			next = n;
	}

}

	public Somenode first; //this node itself already contains two element, item & next
	private int size_counter;

	public DLList(LochNess x) {
		first = new Somenode(x,null); 
		size_counter = 1;
	}

	// void addFirst returns nothing but changes 'first'
	public void addFirst(LochNess x){
		first = new Somenode(x, first);
		size_counter += 1;
	}

	public LochNess getFirst(){
		return first.item;
	}

	public void addLast(LochNess x){
	Somenode p = first;
	while (p.next != null) {
		p = p.next;
	}
	p.next = new Somenode(x, null);
	size_counter += 1;
}

	public LochNess getLast(){
		Somenode y = first;
		while (y.next != null) {
			y = y.next;
		}
		return y.item;

	}

	public int size(){
		return size_counter; //why first?????
	}

	public int sizeFast(){
		return size_counter;
	}


	/** ---------- However, when using this class, the type of input has to be clarified --------- */
	public static void main(String[] args) {
		DLList<String> s1 = new DLList<String> ("bone");
		s1.addFirst("thugs");
	}


}