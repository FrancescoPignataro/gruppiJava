package org.generation.italy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// Inserire in un array i nomi, chiedere all'utente quanti gruppi formare
		//  e generare in modo casuale i gruppi di dimensione ideale
		
		Scanner sc = new Scanner(System.in);
		int gruppi;
		int dimensione;
		Random R = new Random();
		String [] Nomi = {"Tiberia","Persico","Lozzi","Cuccuru","Cuomo","Patitucci",
				"Tanase","Di Biase","Lo Re","Pagliarini","Fanasca","Germani",
				"Foco","Pignataro","Troiani","Cingolani","Fanelli","Farroni",
				"Turino","Hubencu","Franco","Luzzi","Ganesio","Martinez","Dascalu",
				"Sgarlata","Allegrini","Barone","Bellucci","Mingione","Trovato"};
		
		int n;
		int conta = 0;
		int personeAggiunte=0;
		
		System.out.println("Quanti gruppi si devono formare?");
		gruppi =Integer.parseInt(sc.nextLine());
		if (gruppi>Nomi.length) {
			System.out.println("Numero di gruppi non valido");
			gruppi=31;
		}
			
		dimensione = Nomi.length/gruppi;
		
		for (int i=0;i<gruppi;i++) {
			ArrayList <String> gruppo = new ArrayList<>();
			conta=0;
				while (conta<dimensione) {
					 n = R.nextInt(Nomi.length);
					 if (Nomi[n]!="estratto") {
						gruppo.add(Nomi[n]);
						Nomi[n]="estratto";
						conta+=1;
						personeAggiunte++;
					 }
					 
					}
				//se siamo arrivati all'ultimo gruppo e il numero di persone aggiunte
				//Ã¨ minore del numero di persone preseni nell'array, continuiano ad
				//aggiungere all'ultimo gruppo
				if (i==gruppi-1) {
					while(personeAggiunte<Nomi.length) {
						n = R.nextInt(Nomi.length);
						if (Nomi[n]!="estratto") {
							gruppo.add(Nomi[n]);
							Nomi[n]="estratto";
							conta+=1;
							personeAggiunte++;
						 }
					}
				}
				System.out.println(gruppo); 
				}	
				
				
		sc.close();

System.out.println("sono stati creati questi gruppi");
		
		
	}


		

	}


