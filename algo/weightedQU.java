// weighted quick union -- as an improved algo
//depth of any node x is at most logN
public class weightedQU {
	//flatten the tree
	private int root(int i){
		while (i != id[i]){
			id[i] = id[id[i]]; //this is the extra line for flattening
			i = id[i];
		}
		return i;
	}
	
}