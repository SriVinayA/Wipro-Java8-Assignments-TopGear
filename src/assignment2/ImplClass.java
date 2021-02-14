package assignment2;

public class ImplClass implements Piano, Guitar {

	@Override
	public void play() {
		Piano.super.play();
		System.out.println("class implementation");
		Guitar.super.play();
	}
}
