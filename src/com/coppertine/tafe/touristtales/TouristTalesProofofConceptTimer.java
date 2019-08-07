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
    public static void main(final String[] args) {
        TouristTalesProofofConceptTimer mainFrame =
                new TouristTalesProofofConceptTimer();
        mainFrame.run();
    }

    /**
     *
     */
    private void run() {
        final int windowLength = 550;
        final int windowHeight = 300;
        setBounds(0, 0, windowLength, windowHeight);
        setTitle("TouristTales - Timer");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);

        this.addWindowListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {

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
