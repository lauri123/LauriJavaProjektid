package Praktikum4;

import lib.TextIO;

/**
 * 
 * @author llaidna
Trükkida ekraanile selline tabel:
        0 1 2 3 4 5 6 7 8 9
        1 2 3 4 5 6 7 8 9 0
        2 3 4 5 6 7 8 9 0 1
        3 4 5 6 7 8 9 0 1 2
        4 5 6 7 8 9 0 1 2 3
        5 6 7 8 9 0 1 2 3 4
        6 7 8 9 0 1 2 3 4 5
        7 8 9 0 1 2 3 4 5 6
        8 9 0 1 2 3 4 5 6 7
        9 0 1 2 3 4 5 6 7 8
 */

public class Ylesanne6 {

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
				System.out.print((j + i) % 6 + " ");
			}
			System.out.print("|");
			System.out.println();
		}

		System.out.println(kriips);

	}

}
