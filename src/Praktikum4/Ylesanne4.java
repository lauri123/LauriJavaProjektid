package Praktikum4;


/**
 * 
 * @author llaidna
 *Trükkida ekraanile selline tabel:
        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1
 */

public class Ylesanne4 {

	public static void main(String[] args) {
	
		int size = 6;

		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				if (j == i) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
