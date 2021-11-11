
public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		System.out.println("-----------");
		
		GameCalculator gameCalculator = new ManGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
	}

}
