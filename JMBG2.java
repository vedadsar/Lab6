
import java.util.Scanner;
public class JMBG2 {
	public static void main(String[] args) {
		
		String JMBG;
		System.out.println("Unesite vas JMBG ");
		Scanner in = new Scanner(System.in);
		JMBG = in.next();
		
		if(JMBG.length() != 13){
			System.out.println("JMBG nije ispravan, unesite novi JMBG");
			JMBG = in.next();
		}
	

		String jedan = JMBG.substring(0, 1);
		int prvi = Integer.parseInt(jedan);

		String dva = JMBG.substring(1, 2);
		int drugi = Integer.parseInt(dva);

		String tri = JMBG.substring(2, 3);
		int treci = Integer.parseInt(tri);

		String cetiri = JMBG.substring(3, 4);
		int cetvrti = Integer.parseInt(cetiri);

		String pet = JMBG.substring(4, 5);
		int peti = Integer.parseInt(pet);

		String sest = JMBG.substring(5, 6);
		int sesti = Integer.parseInt(sest);

		String sedam = JMBG.substring(6, 7);
		int sedmi = Integer.parseInt(sedam);

		String osam = JMBG.substring(7, 8);
		int osmi = Integer.parseInt(osam);

		String devet = JMBG.substring(8, 9);
		int deveti = Integer.parseInt(devet);

		String deset = JMBG.substring(9, 10);
		int deseti = Integer.parseInt(deset);

		String jedanaest = JMBG.substring(10, 11);
		int jedanaesti = Integer.parseInt(jedanaest);

		String dvanaest = JMBG.substring(11, 12);
		int dvanaesti = Integer.parseInt(dvanaest);

		String trinaest = JMBG.substring(12, 13);
		double trinaesti = Double.parseDouble(trinaest);

		double ostatak = (double) (7 * prvi + 6 * drugi + 5 * treci + 4
				* cetvrti + 3 * peti + 2 * sesti + 7 * sedmi + 6 * osmi + 5
				* deveti + 4 * deseti + 3 * jedanaesti + 2 * dvanaesti) % 11;
		
		double zbir = ostatak + trinaesti;
		
		
		if ( ( (ostatak==0) && (trinaesti==0) )  || (zbir==11.0)){
			System.out.println("Broj je ispravan");
		}
			else
				System.out.println("Broj nije ispravan");
		}


}
