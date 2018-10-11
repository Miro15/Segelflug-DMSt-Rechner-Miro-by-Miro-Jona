package pack1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double  distanz=0, index=0, punkte=0, angemeldet=0;
		
		int dreieck = 0;
		
		Scanner ScannerVariable = new Scanner(System.in);
		
		System.out.println("Gebe deine Distanz in Kilometern an: ");
		distanz=ScannerVariable.nextDouble();
		punkte = distanz * 100;
		
		System.out.println("Gebe deinen Index in als Ganzzahl ein: ");
		index=ScannerVariable.nextDouble();
		punkte=punkte/index;
		System.out.println("Punkte:" + punkte);
		
		System.out.println("War dein Flug ein FAI-Dreiecks oder ein FAI-Vierecks Flug, so bestätige dies bitte mit einem (Ja[1]/Nein[2])");
		dreieck=ScannerVariable.nextInt();
		
		if( dreieck >= 3 && dreieck <= 0) {   //|| Oder && Und ! Nicht != Nicht gleich
			
			System.out.println("Deine Getätigte Eingabe war nicht korrekt du hässlicher Spast, verpiss dich du Tanzverbot Fanboy");
		}
		
		if( dreieck == 1) {
			
			punkte = punkte * 1.3;
			System.out.println("Punkte:" +punkte);
		}
		if( dreieck == 2) {
			
			System.out.println("Punkte:" +punkte);
		}	
		
		System.out.println("War dein Flug angemeldet, so bestätige dies mit einem (Ja[1]/Nein[2]");
		angemeldet=ScannerVariable.nextDouble();
		
		if( angemeldet == 1 ) {
			
			punkte = punkte * 1.4;
		}
	}
	
}