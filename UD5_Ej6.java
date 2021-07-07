//DAVID RIVERA ARTERO
import javax.swing.JOptionPane;
public class UD5_Ej6 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("DAME EL PRECIO DEL PRODUCTO");
		
		Double precioFinal = Double.parseDouble(numero);
		
		final double IVA = 0.21;
		
		JOptionPane.showMessageDialog(null, "El precio final del producto es: " + (precioFinal + (precioFinal * IVA)));

	}

}
