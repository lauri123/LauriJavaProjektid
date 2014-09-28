package praktikum2;
import lib.TextIO;

public class KaheInputiKorrutisOutputti {
	public static void main(String[] args) {
		
		// toimib 32bitiste arvudega
		// küsib 2 arvu, korrutab ja väljastab need
		
		System.out.println("Sisesta kaks korrutatavat arvu");
		
		int userInput1;  // the number 1 input by the user
		int userInput2;  // the number 2 input by the user
		
		System.out.print("sisesta esimene arv: ");		
		userInput1 = TextIO.getlnInt();
		System.out.println("sisestasid esimeseks arvuks: " + userInput1);
		System.out.print("sisesta teine arv: ");
		userInput2 = TextIO.getlnInt();
		System.out.println("sisestasid teiseks arvuks: " + userInput2);		
		System.out.print("nende arvude korrutis on: ");
		System.out.print(userInput1 * userInput2);
	}

}