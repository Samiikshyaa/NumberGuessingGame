package numbergame;

public class formatting {
	public static void main(String[] args) {
		int score = 20;
		System.out.println("----------------------------------");
		System.out.println("|  Moye Moye                     |");
		System.out.println("----------------------------------");
		System.out.println("|   Your Score -> "+ score + "            |");
		System.out.println("----------------------------------");
		
		int p=10, t =2, r = 9;
		double i = (p*t*r)/100.0;
		double a = i+p;
		
		System.out.println(i);
		System.out.println(a);
		
		String mutu = " <3 ";
		for (int j=5; j>0; j--) {
			for (int b=0; b<j; b++) {
				System.out.print(mutu);
			}
			System.out.println(" ");
		}
		
		System.out.println("==========================");
		
		int life = 3;
		String result = " ";
		for (i = life; i>0; i--) {
			
			System.out.print(result.concat(mutu));
		}
	}
}
