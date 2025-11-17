/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
public class Circulo extends D2{
    public int raio;
    
    @Override public double area() { return Math.PI*raio*raio; 
    }
    
    @Override public double perimetro() { return Math.PI*raio*raio;
    
    }
    
    
      
    @Override public void desenhar(Graphics g) {
        
        super.desenhar(g);
        g.setColor(corInterna);
        g.fillOval(x, y, raio, raio);
        g.setColor(cor);
        g.drawOval(x, y, raio, raio);
       
    }
    
}
