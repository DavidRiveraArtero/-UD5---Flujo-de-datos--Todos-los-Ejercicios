//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej12 {

	public static void main(String[] args) {
		
		String contra = "hola";
		
		boolean salir = false;
		
		int intentos = 3; 

		while (intentos > 0 && salir == false) {
			String cont = JOptionPane.showInputDialog("Tienes " + intentos + " para ganar");
			
			if (contra.equalsIgnoreCase(cont)) {
				salir = true;
			}else {
				intentos--;
				JOptionPane.showMessageDialog(null, "Has fallado te quedan "+ intentos);
			}
			
		}
		
	}

}
