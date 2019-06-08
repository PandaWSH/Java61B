public class IntList {
	public int first; // the first element
	public IntList rest; // the rest

	// create a constructor for the better expression
	public IntList(int f, IntList r){
		first = f;
		rest = r;
	}
	/** method -- size
	   recursion */
	public int size_r(){
		//base line
		if (rest == null){
			return 1;
		}
		//other wise, add counter with 1, deal with the rest in the list
		return 1 + this.rest.size_r(); //this is like self in python
	}

	/** method -- size
	   iteration */
	public int size_i(){
		IntList p = this; //call current input list
		int counter = 0;
		while (p != null ){
			counter += 1;
			p = p.rest;
		}
		return counter;
	}

	/** method -- get the i_th item of the 
	    recursive way */
	public int get(int n){
		if (n == 0){
			return first;
		}
		n -= 1;
		return this.rest.get(n);		
	}

	//main body
	public static void main(String[] args) {
		/** initial basic but not friendly expression without constructor

		// creat a new IntList
		IntList L = new IntList();
		L.first = 5; //first element
		L.rest = null; // the

		// continue with the first sub-list node
		L.rest = new IntList();
		L.rest.first = 10;

		// continue
		L.rest.rest = new IntList();
		L.rest.rest.first = 15;
		*/

		/** better expression, but this it REVERSE */
		// create a new IntList L
		IntList L = new IntList(15, null);
		L = new IntList(10,L);
		L = new IntList(5,L);

		//use the size method and tell the size of the L list
		System.out.println(L.get(0));
	}
}

