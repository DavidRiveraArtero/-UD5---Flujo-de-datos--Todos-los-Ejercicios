//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej13 {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("DAME EL PRIMER NUMERO: ");
		
		Double numero1 = Double.parseDouble(num1);
		
		String num2 = JOptionPane.showInputDialog("DAME EL SEGUNDO NUMERO: ");
		
		Double numero2 = Double.parseDouble(num2);
		
		String operacion = JOptionPane.showInputDialog("QUE OPERACION QUIERES HACER: + , - , * , / , ^ , %");
		
		switch (operacion) {
			case "+":
				JOptionPane.showConfirmDialog(null, numero1 + numero2);
				break;
				
			case "-":
				JOptionPane.showConfirmDialog(null, numero1 - numero2);
				break;
			
			case "*":
				JOptionPane.showConfirmDialog(null, numero1 * numero2);
				break;
				
			case "/":
				JOptionPane.showConfirmDialog(null, numero1 / numero2);
				break;
				
			case "^":
				JOptionPane.showConfirmDialog(null, Math.pow(numero1, numero2));
				break;
				
			case "%":
				JOptionPane.showConfirmDialog(null, numero1 % numero2);
				break;
				
		}
		
		
		
		
				
					
			
		
		
	}

}
