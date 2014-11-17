
public class JMBG {
public static void main(String[] args) {
	String JMBG = "0306991170148";
	String dan = JMBG.substring(0,2);
	String mjesec = JMBG.substring(2, 4);
	String godina = JMBG.substring(4,7);			
	System.out.println("Datum rodjenja je " +dan +"." +mjesec +"." +godina);
	String regija = JMBG.substring(7,9);
	System.out.println("Regija rodjenja je " +regija +" ( SARAJEVO ) ");
	String spol = JMBG.substring(9,12);
		System.out.println("Spol " + spol + " MUSKI");
	
}
}
