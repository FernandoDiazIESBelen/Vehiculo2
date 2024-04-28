
package vehiculo;

/**
 *
 * @author FernandoDiaz
 * @since 28/04/2024
 * @version 1.0
 * 
 */
public class miVehiculoFDC2223 {

    /**
     * Metodo para devolver el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para devolver el precio
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para devolver el precioIVA    
     *
     * @return
     */
    public double getPrecioIVA() {
        return precioIVA;
    }


    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Parametro para el nombre
     */
    protected String nombre;
    /**
     * parametro para el precio
     */
    protected double precio;
    /**
     * parametro para el precioIVA
     */
    protected double precioIVA;
    /**
     * parametro para el stock
     */
    protected int stock;

    /**
     * Constructor sin argumentos
     */
    public miVehiculoFDC2223 ()
    {
    }
    
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom
     * @param precio
     * @param stock 
     */
    public miVehiculoFDC2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     * Método para asignar el nombre del vehiculo
     * @param nom parametro nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad parametro cantidad
     * @throws Exception 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Vender coche
     * @param cantidad parametro contidad
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

