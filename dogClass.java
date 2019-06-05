public class dogClass {
	public int weight_of_it;

	public dogClass(int w){
		weight_of_it = w;
	}

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