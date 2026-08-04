import javax.swing.JOptionPane;

public class Tarea1 {

    public void Parquear() {
        int velocidadactual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad actual:"));
        
        if (velocidadactual == 0) {
            JOptionPane.showMessageDialog(null, "El carro se detuvo, carro parqueado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No puedes parquear mientras el carro esté en movimiento");
        }
    }

    public void velocidad() {
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia:"));
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo:"));
        
        int velocidadcalculada = distancia / tiempo;
        JOptionPane.showMessageDialog(null, "La velocidad del carro es: " + velocidadcalculada);
    }

    public void Distanciaplanohorizontal() {
        int distanciainicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese distancia inicial:"));
        int distanciafinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese distancia final:"));
        
        int distanciatotal = distanciafinal - distanciainicial;
        JOptionPane.showMessageDialog(null, "La distancia recorrida en el plano horizontal es: " + distanciatotal);
    }
}
