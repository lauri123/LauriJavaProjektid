package Praktikum4;

import lib.TextIO;

/**
 * 
 * @author llaidna
Trükkida ekraanile selline tabel koos ääristega. Tabeli kõrgus on sama mis laius - see suurus küsi kasutaja käest.
        -----------------
        | x 0 0 0 0 0 x |
        | 0 x 0 0 0 x 0 |
        | 0 0 x 0 x 0 0 |
        | 0 0 0 x 0 0 0 |
        | 0 0 x 0 x 0 0 |
        | 0 x 0 0 0 x 0 |
        | x 0 0 0 0 0 x |
        -----------------
 */

public class Ylesanne5 {

	public static void main(String[] args) {
	
		int size;
		
		System.out.print("Table size?: ");		
		size = TextIO.getlnInt();

		// uuri järgnevat loogikat, mis on MM kirjutatud:
		String kriips = "";
		for (int i = 0; i < size*2+3 ; kriips = kriips + "-",i++);
		System.out.println(kriips);
		
		
		for (int i = 0; i < size; i++) {
			System.out.print("| ");
			for (int j = 0; j < size; j++) {
				
				if (j == i || i + j == size-1) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.print("|");
			System.out.println();
		}

		System.out.println(kriips);

	}

}
