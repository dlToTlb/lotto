
public class Player {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] lotto2 = lotto.getLotto();
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto2[i]);
			
		}
	}

}
