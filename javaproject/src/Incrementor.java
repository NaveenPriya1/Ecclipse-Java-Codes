// static

public class Incrementor {
	int counter = 0;

	Incrementor() {
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {
		Incrementor i1 = new Incrementor();
		Incrementor i2 = new Incrementor();
		new Incrementor();
	}

}
