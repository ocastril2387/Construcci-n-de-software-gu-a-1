
/**
 * Write a description of class Cuerpo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuerpo
{
    private Partes_del_Cuerpo[] extremidades;
    
    public Cuerpo()
    {
        extremidades = new Partes_del_Cuerpo[3];
        extremidades[0] = new Brazo();
        extremidades[1] = new Manos ();
    }   
    
}
