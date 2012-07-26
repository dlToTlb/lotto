import java.util.Random;


public class Lotto {

	/**
	 * @param args
	 * 인스턴스변수
	 */
	public static void main(String[] args) {
		new Lotto().printLotto();
	}
	public void printLotto() {
		for (int i = 0; i < 6; i++) {
			System.out.println(getNumber());	
		}
	}

	Random random = new Random();
	private int getNumber() {
		return random.nextInt(45) + 1;
	}

}
