//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej10 {

	public static void main(String[] args) {
		
		String numTotalVentas = JOptionPane.showInputDialog("DAME EL NUMERO TOTAL DE PRODUCTOS: ");
		
		int precio = 0;
		
		Double ventas = Double.parseDouble(numTotalVentas);
		
		while (ventas > 0) {
			precio = precio + 12;
			ventas--;
		}
		
		JOptionPane.showMessageDialog(null, "Total de ventas " + precio);
		
		
	}

}
