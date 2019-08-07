/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coppertine.tafe.touristtales;

import java.awt.Button;
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
 * @author Coppertine
 * @version 0.0.1 pre
 */
public class TouristTalesProofofConceptTimer extends JFrame
        implements ActionListener, WindowListener, KeyListener {
    /**
     * Global Button objects used within program.
     */
    private Button btnStart, btnStop, btnSettings;

    /**
     * Object that changes depending on the state of the current timer.
     */
    private boolean timerRunning = false;

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        TouristTalesProofofConceptTimer mainFrame =
                new TouristTalesProofofConceptTimer();
        mainFrame.run();
    }

    /**
     * Creates the Swing Layout frame to the program.
     */
    private void run() {
        final int windowLength = 550;
        final int windowHeight = 300;
        setBounds(0, 0, windowLength, windowHeight);
        setTitle("TouristTales - Timer");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        generateGUI();
        this.addWindowListener(this);
        setVisible(true);
    }

    /**
     * References all GUI objects to the program.
     */
    public final void generateGUI() {
        renderButtons();
    }

    /**
     * Creates and renders buttons used within this GUI.
     */
    public final void renderButtons() {
        
    }

    @Override
    public final void actionPerformed(final ActionEvent e) {
        if (e.getSource() == btnStart) {
            
        }
        if (e.getSource() == btnStop) {
            
        }
        if (e.getSource() == btnSettings) {
            
        }
    }

    @Override
    public void windowOpened(final WindowEvent e) {

    }

    @Override
    public final void windowClosing(final WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(final WindowEvent e) {

    }

    @Override
    public void windowIconified(final WindowEvent e) {

    }

    @Override
    public void windowDeiconified(final WindowEvent e) {

    }

    @Override
    public void windowActivated(final WindowEvent e) {

    }

    @Override
    public void windowDeactivated(final WindowEvent e) {

    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {

    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }

}
