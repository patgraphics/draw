/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessin;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author waksmann
 */
public class Fen extends Frame
{

    //declaration des variables
    private Groupe gr = new Groupe();
    private Trait enCours;

    //constructeur
    public Fen()
    {
        new Ecoutesouris(this); //creation ecouteur qui va gerer les actions de la souris
        new Ecoutefenetre(this); //creation ecouteur qui va gerer les actions de la fenetre
        setBounds(800, 600, 350, 250); //def position et taille dans le constructeur
        setVisible(true);

    }

    public void debuterTrait(Point p)
    {
        if (!gr.isFull())
        {
            enCours = new Trait(p);
        }

    }

    public void arreterTrait(Point p)
    {
        if (!gr.isFull())
        {
            enCours.arreterTrait(p);    //initialise la position d'arret du trait
            gr.add(enCours);            //stocke les positions du trait dans le tableau
            enCours = null;               // remet la val à 0 pour faire nouveau trait
            repaint();
        }
    }

    public void glisserTrait(Point p)
    {
        if (!gr.isFull())
        {
            enCours.arreterTrait(p);    //initialise la position d'arret du trait
            
            repaint();
        }
    }

    @Override
    public void paint(Graphics g)
    {
        //dessin des lignes jusqu'à nblignes
        gr.paint(g);

        //dessin du groupe
        if (enCours != null)
        {
            enCours.paint(g);
        }
        titre();
    }

    public void effacerTrait()
    {
        gr.suppDernier();
        repaint();
    }

    public void effacerTout()
    {
        gr.suppTout();
        repaint();
    }

    public void titre()
    {
        if (!gr.isFull())
        {
            setTitle(gr.size() + "trait(s) tracé(s)");
        } else
        {
            setTitle("Attention maximum atteint");
        }
    }
}
