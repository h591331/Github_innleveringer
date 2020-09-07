package obligatorisk2;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static 

public class Trinnskatt2 {

	
	public static void main(String[] args) {
		double Sum = brInntekt();
		
		showMessageDialog(null, "Trinnskatt beløp: " + Sum + " kr" ); 
	}
	
	public static double brInntekt() {

		double inntekt = parseDouble( showInputDialog("Gi bruttoinntekt: "));
		
		// Trinn for inntekt
		double trinn1 = 180800;
		double trinn2 = 254500;
		double trinn3 = 639750;
		double trinn4 = 999550;
				
		// Skatt for trinn
		double P1 = 0.019;
		double P2 = 0.042;
		double P3 = 0.132;
		double P4 = 0.162;
				
		double Sum = 0;
				
						
		if (inntekt > trinn1) {	
			Sum += (inntekt - trinn1) * P1;
		}
						
		if (inntekt > trinn2) {	
			Sum += (inntekt - trinn2) * P2;
		}
				
		if (inntekt > trinn3) {	
			Sum += (inntekt - trinn3) * P3;
		}
						
		if (inntekt > trinn4) {	
			Sum += (inntekt - trinn4) * P4;
		}
		return Sum;
			
	}	
	
}
