package pack1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int  distanz=0, index=0, punkte=0;
		
		char dreieck = 0;
		
		Scanner lesen = new Scanner(System.in);
		
		System.out.println("Gebe deine Distanz in Kilometern an: ");
		//Eingabe des int distanz
		int anzahl = lesen.nextInt();
		double [] noten = new double [anzahl];
		
		for (int i = 0; i< noten.length;i++){
			noten[i] = lesen.nextDouble();
			System.out.print(noten[i] * 100);
		}
		System.out.println("Gebe deinen Index in als Ganzzahl ein: ");
		//Eingabe des Index
		System.out.println("War dein Flug ein FAI-Dreiecks oder ein FAI-Vierecks Flug, so bestätige dies bitte mit einem (J/N)");
		//Eingabe charachters dreieck
		
		
	    
		punkte = distanz * 100;
		punkte = punkte / index;  
		
		if( dreieck == 'J') {
			
			//+der Punkte für ein Dreieck oder eines Vierecks
		}
	}
}

