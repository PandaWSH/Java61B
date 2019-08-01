public class dogClass {
	// instant variable 
	public int weight_of_it;

	/** this is just like __init__(self, w) in Python 
	it's called a constructor*/
	public dogClass(int w){
		weight_of_it = w;
	}
	// create the makeNoise function
	public void makeNoise() {
		if (weight_of_it < 10){
			System.out.println("I am a poppy.");
		}
		else if (weight_of_it < 30){
			System.out.println("I am a medium dog.");
		}
		else{
			System.out.println("I am a big dog.");
		}
	}
}