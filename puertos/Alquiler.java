
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private int VALOR_FIJO_ALQUILER = 300;
    private int MULTIPLICADOR_ESLORA = 10;
    
    public Alquiler(int dias, Cliente cliente, Barco barco){
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }
    
    public String toString(){
        return "Número de días de alquiler: " + numeroDias + "\n" + "Cliente: " + cliente.toString() + "Barco: " + barco.toString();
    }
    
    public float getCosteAlquiler(){
        return numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA) + VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua();
    }
}
