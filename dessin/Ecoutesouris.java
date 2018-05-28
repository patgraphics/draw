/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessin;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author waksmann
 */
public class Ecoutesouris implements MouseListener, MouseMotionListener
{
    
    private Fen fen;
    public Ecoutesouris(Fen f)
    {
        fen = f;
        fen.addMouseListener(this);
        fen.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        if ((SwingUtilities.isLeftMouseButton(e))&&e.getClickCount()==2)
            fen.effacerTout();
            
        if (SwingUtilities.isRightMouseButton(e))
            fen.effacerTrait();
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        
         if (SwingUtilities.isLeftMouseButton(e))
            fen.debuterTrait(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        if (SwingUtilities.isLeftMouseButton(e))
            fen.arreterTrait(e.getPoint());
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
               

    }

    @Override
    public void mouseExited(MouseEvent e)
    {
                

    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        if (SwingUtilities.isLeftMouseButton(e))
            fen.glisserTrait(e.getPoint());
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
                

    }
   
}
