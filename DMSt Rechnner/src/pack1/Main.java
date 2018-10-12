package pack1;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.text.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#0.00");
		
		double  distanz=0, index=0, punkte=0, angemeldet=0, endeingabe = 0;
		
		int dreieck = 0, viereck = 0;
		
	//	JFrame f1 = new JFrame("DMSt Rechner");
	//	f1.setVisible(true);
		//f1.pack();
		//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f1.setResizable(false);
		
		//JPanel p1 = new JPanel();
		//f1.add(p1);
		
		//JTextField tf1 = new JTextField(50);
		//p1.add(tf1);
		
		
		do {
			
			Scanner ScannerVariable = new Scanner(System.in);
			
			System.out.println("Gebe deine Distanz in Kilometern an: ");
			distanz=ScannerVariable.nextDouble();
			punkte = distanz * 100;
			
			System.out.println("Gebe deinen Index in als Ganzzahl ein: ");
			index=ScannerVariable.nextDouble();
			punkte=punkte/index;
			
			System.out.println("War dein Flug ein FAI-Dreiecksflug? (Ja[1]/Nein[2])");
			dreieck=ScannerVariable.nextInt();
			
			if( dreieck == 1) {
				
				punkte = punkte * 1.4;
				System.out.println("War dein Flug angemeldet, so bestätige dies mit einem (Ja[1]/Nein[2]");
				angemeldet=ScannerVariable.nextDouble();
				
				if( angemeldet == 1 ) {
					
					punkte = punkte * 1.3;
					System.out.println(f.format("Punkte:"+punkte));
				}
				if( angemeldet == 2 ) {
					
					System.out.println("Punkte:" +punkte);
				}
				if( angemeldet >= 3 && angemeldet <= 0) {   //|| Oder && Und ! Nicht != Nicht gleich
					
					System.out.println("Deine Getätigte Eingabe war nicht korrekt du hässlicher Spast, verpiss dich du Tanzverbot Fanboy");
				}
			}
			if( dreieck == 2) {
				System.out.println("War dein Flug ein angemeldeter FAI-Vierecksflug? (Ja[1]/Nein[2])");
				viereck=ScannerVariable.nextInt();
				if( viereck == 1) {
					punkte = punkte * 1.7;
					System.out.println("Punkte:" +punkte);
				}
				if( viereck == 2) {
					System.out.println("Punkte:" +punkte);
				}
				if( viereck >= 3 && viereck <= 0) {   //|| Oder && Und ! Nicht != Nicht gleich
					
					System.out.println("Deine Getätigte Eingabe war nicht korrekt du hässlicher Spast, verpiss dich du Tanzverbot Fanboy");
				}
				}
				if( dreieck >= 3 && dreieck <= 0) {   //|| Oder && Und ! Nicht != Nicht gleich
				
					System.out.println("Deine Getätigte Eingabe war nicht korrekt du hässlicher Spast, verpiss dich du Tanzverbot Fanboy");
				} 
				
				System.out.println("Möchtest du das Programm wiederholen? (Ja[1]/Nein[2])");
				endeingabe=ScannerVariable.nextInt();
				
				if ( endeingabe != 1) {
					
					System.exit(0);
				}
				
		 	}	while( endeingabe == 1 ); 
		}
}	