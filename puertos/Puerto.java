
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private Alquiler[] alquileres;
    private int NUMERO_AMARRES = 4;
    
    public Puerto(){
        alquileres = new Alquiler[NUMERO_AMARRES];
    }
    
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco){
        int posicion = -1;
        for(int i = 0; i < NUMERO_AMARRES && posicion == -1; i++){
            if(alquileres[i] == null){
                System.out.println("El amarre " + (i+1) + " está vacío."); 
            }
            else{
                System.out.println("El amarre " + (i+1) + " está alquilado, y su precio es de " + alquileres[i].getCosteAlquiler());
            }
        }
        return posicion;
    }
    
    public void verEstadoAmarres(){
        //muestra el precio del alquiler
        
    }
    
    public void liquidarAlquiler(int posicion){
        alquileres[posicion] = null;
    }
}
