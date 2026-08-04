import javax.swing.JOptionPane;

public class galleta {

   //atributos construir lista de objetos 
    public String ingredientes; 
    public String forma;
  // acciones : cocinar ,, servir , comer,vender
    public void cocinar(){
        ingredientes= JOptionPane.showInputDialog("Ingrese el 3 ingredientes");
        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la temperatura"));
        if(temperatura<180){
            JOptionPane.showMessageDialog(null, ingredientes+ temperatura+ "galleta clasica ");
        }else if(temperatura>200 || temperatura<180){
            JOptionPane.showMessageDialog(null, "galleta gruesa");
        }else{
             JOptionPane.showMessageDialog(null, "galleta fina");

        }

        forma= JOptionPane.showInputDialog("Ingrese la forma en que desea su galleta");
    }
    

}