package uabc.computacion.dados;

/**
 * Clase main para el proyecto Dados
 * @author
 */
public class Main {
    public static void main(String[] args)
    {
        // Se crea una instancia de la clase Dado
        Dado dado = new Dado();
        // Se crean dos arreglos para almacenar la frecuencia
        // con que sale una cara del dado
        int[] resulSeisCaras = new int[7];
        int[] resulDoceCaras = new int[13];
        
        int numCarasDado = dado.getNumCaras();
        System.out.println("Se lanza 100 veces el dado de " + numCarasDado + " caras");
        
        for(int i = 0; i < 100; i++)
        {
            int cara = dado.lanzarDado();
            resulSeisCaras[cara]++;
        }
        
        dado.cambiarNumCaras();
        numCarasDado = dado.getNumCaras();
        System.out.println("Se lanza 100 veces el dado de " + numCarasDado + " caras"); 
        for(int i = 0; i < 100; i++)
        {
            int cara = dado.lanzarDado();
            resulDoceCaras[cara]++;
        }
        
        System.out.println("Resultados del dado de seis caras:");
        int totalTiradas = 0;
        
        for(int i = 1; i < 7; i++)
        {
            System.out.println("Número " + i + ": " + resulSeisCaras[i] + " veces");
            totalTiradas += resulSeisCaras[i];
        }        
        
        System.out.println("Total de tiradas: " + totalTiradas + " veces");
        
        System.out.println("Resultados del dado de doce caras:");
        totalTiradas = 0;
        
        for(int i = 1; i < 13; i++)
        {
            System.out.println("Número " + i + ": " + resulDoceCaras[i] + " veces");
            totalTiradas += resulDoceCaras[i];
        }
        System.out.println("Total de tiradas: " + totalTiradas + " veces");
    }
}
