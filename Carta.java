
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // instance variables - replace the example below with your own
    private int valor;
    private String palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        // initialise instance variables
        this.valor = valor;
        this.palo = palo;
        
    }

    /**
     *  devuelve una cadena con el nombre de la carta.
     */
    public void getNombre()
    {
        // put your code here
        System.out.println( valor + " de " + palo);
    }
    
    /**
     * retorna un entero con el valor correspondiente a la carta 
     */
    public int getValor()
    {
        return valor;
    }
    
    /**
     *  retorna una cadena que contiene el palo correspondiente a la carta
     */
    public String getPalo()
    {
        return palo;
    }
}
