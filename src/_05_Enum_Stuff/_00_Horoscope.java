package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		Zodiac[] zodiac = new Zodiac[12];
		Random r = new Random();
		zodiac[0] = Zodiac.ARIES;
		zodiac[1] = Zodiac.AQUARIUS;
		zodiac[2] = Zodiac.CANCER;
		zodiac[3] = Zodiac.CAPRICORN;
		zodiac[4] = Zodiac.GEMINI;
		zodiac[5] = Zodiac.LEO;
		zodiac[6] = Zodiac.LIBRA;
		zodiac[7] = Zodiac.PISCES;
		zodiac[8] = Zodiac.SAGITTARIUS;
		zodiac[9] = Zodiac.SCORPIO;
		zodiac[10] = Zodiac.TAURUS;
		zodiac[11] = Zodiac.VIRGO;
		getZodi(zodiac[r.nextInt(12)]);
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void getZodi(Zodiac sign) {
		JOptionPane.showMessageDialog(null, "Today's random Zodiac is -"+sign+"- /_(o_O)_/");
	}
	// 3. Make a main method to test your method
	
}
