//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej13 {

	public static void main(String[] args) {
		//LE PEDIMOS AL USUARIO QUE NOS DE EL PRIMER NUMERO
		String num1 = JOptionPane.showInputDialog("DAME EL PRIMER NUMERO: ");
		
		//LUEGO LO PASAMOS A INT
		Double numero1 = Double.parseDouble(num1);
		//LE PEDIMOS AL USUARIO QUE NOS DE EL PRIMER NUMERO
		String num2 = JOptionPane.showInputDialog("DAME EL SEGUNDO NUMERO: ");
		//LUEGO LO PASAMOS A INT
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
