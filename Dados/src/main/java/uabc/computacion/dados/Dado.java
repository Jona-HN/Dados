package uabc.computacion.dados;

import java.util.Random;

/**
 * Clase que simula un dado de 6 o 12 caras
 * @author Jonathan Herrera
 */
public class Dado 
{
    // Número de caras del dado
    private int numCaras;
    
    public Dado()
    {
        numCaras = 6;
    }
    
    /**
     * Cambia el número de caras del dado
     */
    public void cambiarNumCaras()
    {
        numCaras = numCaras == 6 ? 12 : 6;        
    }
    
    /**
     * Lanza un dado
     * @return valor de la cara superior
     */
    public int lanzarDado()
    {
        Random r = new Random();
        int cara = r.nextInt(numCaras) + 1;
                
        return cara;
    }
    
    /**
     * @return número de caras actual
     */
    public int getNumCaras()
    {
        return numCaras;
    }
}
