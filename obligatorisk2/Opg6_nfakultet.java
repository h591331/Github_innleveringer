package obligatorisk2;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;


public class Opg6_nfakultet {

	public static void main(String[] args) {
		boolean ulovlig;
		int n; 
		
		do { 
		 String tall = showInputDialog("Gi n(heltall) = ");
		 n = parseInt(tall);
		 
		 ulovlig = (n < 0);
		 if (ulovlig)
			 showMessageDialog(null, "Uglydig verdi");
		} while(ulovlig);
		
		showMessageDialog(null, n + "! = " + fakultet(n));
	}
	
	public static int fakultet(int maxTall) {
		int nFak = 1;
		for (int tall = 1; tall <=maxTall; tall++)
			nFak = nFak * tall;
		return nFak;
	}

}
