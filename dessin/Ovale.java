/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessin;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author waksmann
 */
public class Ovale 
{
        
    private Point start ;    // le point de depart du Trait
    private Point end ;      // le point d'arrivee du Trait
    private Color couleur;   // la couleur du Trait

    public Ovale (Point ancre)
    {
        if ( ancre == null)
            ancre = new Point();
        
        debuterTrait(ancre);
        arreterTrait(ancre);
        couleur = new Color((int)(Math.random()* 0xffffff));
    }
    
    private void debuterTrait(Point p)
    {
        start = p;
    }
    public void arreterTrait (Point p)
    {
            if ( p != null)
            {
                end = p;
            }
                
    }
    
    public void paint(Graphics g)
    {
        g.setColor(couleur);
        int rayon = 10;
        g.fillOval(start.x-rayon, start.y-rayon, 2*rayon, 2*rayon);
    }
}





