/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessin;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author waksmann
 */
public class Groupe
{
       private final int MAX = 5;
       private ArrayList<Trait> dessin = new ArrayList<>();

    public Groupe()
    {
    }

   
    
 
    public boolean isFull()
    {
           return dessin.size() == MAX;
    }
     public void add(Trait t)
     {
         if (t!=null && !isFull())
             dessin.add(t); 
     }
     public void suppDernier()
     {
         if (dessin.size()>0)
              dessin.remove(dessin.size()-1);
     }
     public void suppTout()
     {
         dessin.clear();
     }
     public void paint(Graphics g)
     {
         for (Trait t : dessin) // pour chaque trait du dessin
         {
           t.paint(g); 
         }
     }

    public int size()
    {
        return dessin.size();
    }
}
