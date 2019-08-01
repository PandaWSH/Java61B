public class quick_find{
	private int[] id;

	public quick_find(int N){
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	// determine if they are the same
	public boolean connected (int p, int q){
		return id[p] == id[q];
	}

	// change all entires with id[p] to id[q], basically set
	// all rest element to the same as the first element
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
			if (id[i] == pid) id[i] = qid;
	}
}

// comments: this method is N^2 slow, and quadratic algorithm do not scale