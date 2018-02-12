
public class EcGameTester {
	public static void main(String[] args) {
		int sucessRate = 0;
		int pushRate = 0;
		int loseRate = 0;
		EcGame g1 = new EcGame();
		for (int i=0; i<1000; i++) {
			g1.play();
			if (g1.getWin()==0) {
				sucessRate++;
			}
			if (g1.getWin()==1) {
				pushRate++;
			}
			if (g1.getWin()==2) {
				loseRate++;
			}
		}
		System.out.println("Won "+sucessRate+" games in 1000 games.");
		System.out.println("Push "+pushRate+" games in 1000 games.");
		System.out.println("Lose "+loseRate+" games in 1000 games.");
	}
}
