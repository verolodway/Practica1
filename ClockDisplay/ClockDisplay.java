
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay 
{
    //Marca las horas
    private int horas;
    //Marca los minutos
    private int minutos;
  /**
   * Constructor for objects of class ClockDisplay
   */  
  public ClockDisplay()
  {
      horas = 00;
      minutos = 00;
  }
  
  public String setTime (int hora1, int minuto1)
  {
      if (horas <=23 && minutos <=59){
         horas = +1;
         minutos = +1;
      }   
      else if (minutos >= 59){
        minutos = 00;
        hora = +1;
      }
      else 
        
  }
}

  

