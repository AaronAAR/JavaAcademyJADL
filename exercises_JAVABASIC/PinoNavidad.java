package ExerciseToPractice;
import java.util.Scanner;

public class PinoNavidad {
	private static Scanner scanner;

	public static void main(String[] args){
		
		scanner = new Scanner(System.in);	
		
		System.out.print("�De que tama�o quieres el pino?(1-10):  ");
		int tama�oPino = scanner.nextInt();
		if(tama�oPino <= 10) {
			//System.out.print(tama�oPino);
			for(int i=tama�oPino; i>0; i--) {
				//System.out.print("*");
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}	
				System.out.println(" ");
			}
			
		} else { System.out.print("Debes ingresar el tama�o del pino del 1 al 10 "); }
	}
}
