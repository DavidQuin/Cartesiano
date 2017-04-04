
package Graficador;

/**
 *
 * @author Dvd
 */
public class PuntosEnLaGrafica {
    
    private int margenEnX;
    private int margenEnY;
    private int largoEjeX;
    private int largoEjeY;
    
    private int altoLienzo;
    private int anchoLienzo;
    
    
    public void LargoYAncho(int heigth, int width){
        altoLienzo = heigth;
        anchoLienzo = width;
        
        calcular();
    }
    
    
    private int MultiplicarPorcentaje(int Cantidad, float porcentaje){
        return Float.floatToIntBits(  
                 Cantidad  * porcentaje
        );
    }
    
    
    private void calcular(){
    
        margenEnX = MultiplicarPorcentaje(anchoLienzo, 0.10f); 
        margenEnY = MultiplicarPorcentaje(altoLienzo, 0.05f);
        
        largoEjeX = MultiplicarPorcentaje(anchoLienzo, 0.70f);
        largoEjeY = MultiplicarPorcentaje(altoLienzo, 0.85f);
        
    }
    
    
    public int MargenEnX(){
        return margenEnX;
    }
    
    public int MargenEnY(){
        return margenEnY;
    }
    
    public int LargoEjeX(){
        return largoEjeX;
    }
    
    public int LargoEjeY(){
        return largoEjeY;
    }
}
