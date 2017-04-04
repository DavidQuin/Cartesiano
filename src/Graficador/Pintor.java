
package Graficador;

import java.awt.Canvas;
import java.awt.Graphics2D;

import java.awt.Color;
import java.awt.BasicStroke;

/**
 * Clase que pintara el gráfico
 * @author Dvd
 */
public class Pintor {
    
    private Canvas lienzo;
    
    private Graphics2D pantallaDeDibujo;
    
    private PuntosEnLaGrafica puntos;
    
    public Pintor(){
        puntos = new PuntosEnLaGrafica();
    }
    
    
    
    public void pasarElCanvas(Canvas lienzo){
        this.lienzo = lienzo;
        ConfigurarLienzo();
        obtenerPantalladeDibujo();
        dibujarEjes();
    }

    
    
    private void obtenerPantalladeDibujo(){
        pantallaDeDibujo = (Graphics2D) lienzo.getGraphics();
    }
    
    
    private void ConfigurarLienzo(){
        puntos.LargoYAncho(lienzo.getHeight(), lienzo.getWidth());
    }
    
    
    private void colorPincel(Color color){
        pantallaDeDibujo.setColor(color);
    }    
    
    private void grosorPincel(float grosor){
        pantallaDeDibujo.setStroke(new BasicStroke(grosor));
    }
    
    
    private void dibujarEjes(){
        
        colorPincel(Color.BLACK);
        grosorPincel(2.0f);
        //eje Y
        pantallaDeDibujo.drawLine(puntos.MargenEnX(), puntos.MargenEnY(), puntos.MargenEnX(), puntos.MargenY_LargoY());
        //eje X
        pantallaDeDibujo.drawLine(puntos.MargenEnX(), puntos.MargenY_LargoY(), puntos.MargenX_LargoX(), puntos.MargenY_LargoY());
    }
    
    
}
