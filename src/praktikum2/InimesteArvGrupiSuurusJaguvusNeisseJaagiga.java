package praktikum2;

import lib.TextIO;

public class InimesteArvGrupiSuurusJaguvusNeisseJaagiga {

	public static void main(String[] args) {
	
		/* Kirjutada programm, mis küsib inimeste arvu 
		 * ja grupi suuruse ning väljastab mitu gruppi 
		 * nendest inimestest moodustada saab 
		 * (täisarvuline jagatis) ja mitu inimest üle jääb 
		 * (jagatise jäägi leidmise jaoks on eraldi 
		 * tehte-märk: %).
		 */

		System.out.println("headcount?:");
		int headcount;  // 
		int groupsize;  // 
		double numberOfGroups;  // 
		
		headcount = TextIO.getlnDouble();
		System.out.println("groupsize?:");
		groupsize = TextIO.getlnDouble();
		numberOfGroups = headcount / groupsize;
		
		System.out.format("Number of groups: %.2f", numberOfGroups);
		
		
		
		
		
		System.out.println("FIN");
	}

}
