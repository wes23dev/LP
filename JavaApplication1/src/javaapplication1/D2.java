/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javaapplication1.Ponto;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
public abstract class D2 extends Ponto {
    
    public Color corInterna;
    boolean showArea = false;
    abstract public double area();
    abstract public double perimetro();
    
    @Override public void desenhar(Graphics g) {
        g.setColor(cor);
        if(showArea) 
            g.drawString(Double.toString(area()), x-10, y-10);  // late binding
    }
    
}
