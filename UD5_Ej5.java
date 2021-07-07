//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej5 {

	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Introduce un numero para saber si es divisible o no");
		
		Double  num = Double.parseDouble(numero);
		
		if (num % 2 == 0 ) {
			
			JOptionPane.showMessageDialog(null, "El numero es divisible entre 2");
			
		}else {
			JOptionPane.showMessageDialog(null, "El numero no es divisible entre 2");
		}
		

	}

}
