public class chapter2_4{
	/**
	three ways of notations:
	y = new int[3]; create an array with three boxs but empty each;
	x = new int[]{1,3,5,6,7};
	int[] w = {9,10,11,2,11,14};
	*/
	public static void main(String[] args){
		int[] z = null;
		int[] x,y;

		x = new int[]{1,2,3,4,5};
		y = x;
		x = new int[]{-1,2,5,4,99};
		y = new int[3];
		z = new int[0];
		int xL = x.length;

		String[] s = new String[6];
		s[4] = "ketchup";
		s[x[3] - x[1]] = "muffins";

		int[] b = {9,10,11};
		System.arraycopy(b,0,x,3,2); //copy 2 element starting from b[0] to x staring from x[3]
	}

	/** 
	2-D arrays : an array of arrays
	*/
	int[][] pascalAgain = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}};



	/** 
	Arrays vs Classes
	Array's:
			length is not changeable, can call index
	Class: can be with different type, ex:Planet p = new Planet(6e24, "earth"); c
		   nanot call index, can use dot notation
	*/





}