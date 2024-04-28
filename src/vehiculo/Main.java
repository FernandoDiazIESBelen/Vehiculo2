
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        miVehiculoFDC2223 miVehiculoXXX2223;
        int stockActual;
        
        miVehiculoXXX2223 = new miVehiculoFDC2223("Seat",18000,100);
        operativaVehiculosFDC2223(miVehiculoXXX2223, 50); 
        stockActual = miVehiculoXXX2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    static void operativaVehiculosFDC2223(miVehiculoFDC2223 miVehiculoXXX2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoXXX2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoXXX2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
