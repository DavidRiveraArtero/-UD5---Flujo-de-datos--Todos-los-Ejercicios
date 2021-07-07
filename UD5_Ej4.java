//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej4 {

	public static void main(String[] args) {
		
	
		String num=JOptionPane.showInputDialog("Introduce el radio");
		
		double radio = Double.parseDouble(num);
		
		radio = Math.pow(radio, 2);
		
		radio = (3.14 * radio);
		
		JOptionPane.showMessageDialog(null, "El área de el circulo es: " + radio);

	}

}
