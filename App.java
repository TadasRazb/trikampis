package tado;
import java.util.*;
import java.lang.*;
import tado.*;

public class App {

	public static void main(String[] args) {

	/*	Scanner in = new Scanner(System.in);
		System.out.print("Iveskite pirma krastine: ");
		int k1 = in.nextInt();
		System.out.print("Iveskite antra krastine: ");
		int k2 = in.nextInt();
		System.out.print("Iveskite trecia krastine: ");
		int k3 = in.nextInt();

		System.out.print("Ar gaunasi trikampis: " + trikampis(k1, k2, k3) + "\n");

		System.out.print("Ar gaunasi statusis: " + statusis(k1, k2, k3) + "\n");

		System.out.print("Ar gaunasi lygiasonis: " + lygiasonis(k1, k2, k3) + "\n");

		 System.out.print("Ar gaunasi lygiakrastis: " + lygiakrastis(k1, k2, k3));
	}
	public static boolean trikampis(int a, int b, int c) {
		return (((a + b) > c) && ((b + c) > a) && ((c + a) > b));
	}
	public static boolean lygiasonis(int a, int b, int c) {
		return ((a == b ) || (a == c) || (b == c));
	}
	public static boolean statusis(int a, int b, int c) {
		return (((a*a)+(b*b)==(c*c)) || ((a*a)+(c*c)==(b*b)) || ((c*c)+(b*b)==(a*a)));
	}
	public static boolean lygiakrastis(int a, int b, int c) {
		return ((a == b) && (a == c) && (b == c));
	}*/


		System.out.print("Iveskite krastine: ");
		Scanner scan = new Scanner(System.in);
		Double[] atkarpos = new Double[ 20 ];
		Double nuskaityta_atkarpa = scan.nextDouble();

		int n = 0;

		while ( nuskaityta_atkarpa != 0) {
			System.out.print("Iveskite krastine: ");
			atkarpos[ n ] = nuskaityta_atkarpa;
			n++;
			nuskaityta_atkarpa = scan.nextDouble();
		}

		ArrayList<TrikampisMusu> trikampiai= new ArrayList<TrikampisMusu>();

		for (int i = 0; i < n - 2; i++ ) {

			for (int  j = i +1; j < n-1; j++ ) {

				for (int t = j + 1; t < n; t++ ) {

						if (Trikampis.arTrikampis ( atkarpos [ i ], atkarpos [ j ], atkarpos [ t ] )) {
							trikampiai.add(new TrikampisMusu(atkarpos [ i ], atkarpos [ j ], atkarpos [ t ],i,j,t));

							/*if ( Trikampis.arStatusis ( atkarpos [ i ], atkarpos [ j ], atkarpos [ t ] )  ) {
								System.out.println(i + " " + j + " " + t + "-osios atkarpos gali sudaryti statuji trikampi");
							}
							*/
							/*
							if ( Trikampis.arLygiasonis ( atkarpos [ i ], atkarpos [ j ], atkarpos [ t ] )  ) {
								System.out.println(i + " " + j + " " + t + "-osios atkarpos gali sudaryti lygiasoni trikampi");
							}
							*/
							/*
							if ( Trikampis.arLygiakrastis ( atkarpos [ i ], atkarpos [ j ], atkarpos [ t ] )  ) {
								System.out.println(i + " " + j + " " + t + "-osios atkarpos gali sudaryti lygiakrasti trikampi");
						}
						*/
					}
				}
			}
		}
		System.out.println("Galimi trikampiai: " + "\n");
		for (TrikampisMusu trikampis:trikampiai){
			System.out.println(trikampis.toString());
		}
		System.out.print("Galimi status trikampiai: " + "\n");
		for (TrikampisMusu trikampis:trikampiai){
			if (trikampis.arStatusis()){
				System.out.println(trikampis.toString());
			}
		}
		System.out.print("Galimi lygiasoniai trikampiai: " + "\n");
		for (TrikampisMusu trikampis:trikampiai){
			if (trikampis.arLygiasonis()){
				System.out.println(trikampis.toString());
			}
		}
		System.out.print("Galimi lygiakrasciai trikampiai: " + "\n");
		for (TrikampisMusu trikampis:trikampiai){
			if (trikampis.arLygiakrastis()){
				System.out.println(trikampis.toString());
			}
		}

		int i = 0;
		double max = trikampiai.get(0).S; // truksta kazko ???


		System.out.print("Didziausi trikampiai: " + "\n");
		for (i = 0; i < trikampiai.size(); i++ ) {
			if ( trikampiai.get(i).S > max);
				max = trikampiai.get(i).S; //?? nebaigta
		}
		System.out.println("didziausias trikampis :" + max);
	}

		//System.out.println("Didziausio trikampio nr: " + "\n");

}
