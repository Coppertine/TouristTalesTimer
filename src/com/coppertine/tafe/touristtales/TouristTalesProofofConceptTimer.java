/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coppertine.tafe.touristtales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

/**
 *
 * @author nick_
 */
public class TouristTalesProofofConceptTimer extends JFrame
        implements ActionListener, WindowListener, KeyListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TouristTalesProofofConceptTimer mainFrame = new TouristTalesProofofConceptTimer();
        mainFrame.run();
    }

    private void run() {
        setBounds(0,0, 300, 550);
        setTitle("TouristTales - Timer");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
