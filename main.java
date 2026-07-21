/**
 * main
 */
public class main {

    public static void main(String[] args) {
         double cota_inicial=2637.399;
        double cota_final=2637.455; 
        double distancia=12.373;
    
    double pendiente=((cota_final-cota_inicial)/distancia)*100;
    
    System.out.println("resultado de la pendiente "+ pendiente);
    if(pendiente>15){
        System.out.println("Requiere de analisis especial, ajustar las condiciones del terreno");
    }else{
        System.out.println("No requiere de analisis");
    }
    
    }
}