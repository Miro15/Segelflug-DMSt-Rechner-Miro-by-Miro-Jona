package pack1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double  distanz=0, index=0, punkte=0;
		
		char dreieck;
		
		Scanner ScannerVariable = new Scanner(System.in);
		Scanner FAI = new Scanner(System.in);
		
		System.out.println("Gebe deine Distanz in Kilometern an: ");
		//Eingabe des int distanz
		distanz=ScannerVariable.nextDouble();
		punkte = distanz * 100;
		System.out.println("Punkte:" + punkte);
		
		System.out.println("Gebe deinen Index in als Ganzzahl ein: ");
		//Eingabe des Index
		index=ScannerVariable.nextDouble();
		punkte=punkte/index;
		System.out.println("Punkte:" + punkte);
		
		System.out.println("War dein Flug ein FAI-Dreiecks oder ein FAI-Vierecks Flug, so bestätige dies bitte mit einem (J/N)");
		//Eingabe charachters dreieck
		dreieck = FAI.next().charAt(0);
		System.out.println(+dreieck);
	
		}
	}