/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coppertine.tafe.touristtales;

import com.coppertine.tafe.Declarator;
import com.coppertine.tafe.Vector2;
import java.awt.Button;
import java.awt.Dimension;
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

        generateGUI(layout);
        this.addWindowListener(this);
        setVisible(true);
    }

    /**
     * References all GUI objects to the program.
     * @param layout SpringLayout
     */
    public final void generateGUI(final SpringLayout layout) {
        renderButtons(layout);
    }

    /**
     * Creates and renders buttons used within this GUI.
     * @param layout SpringLayout
     */
    public final void renderButtons(final SpringLayout layout) {
        final int buttonHeight = 25;
        final int buttonLength = 80;

        final Vector2 position = new Vector2(15, 200);
        btnStart = generateButton(
                layout,
                new Declarator(
                        btnStart,
                        "Start",
                        position,
                        buttonLength,
                        buttonHeight)
                );
    }

    /**
     * Generates the button to the
     * SpringLayout using the Declarator information.
     * @param layout SpringLayout
     * @param object Object information
     * @return Button
     * @see Button
     * @see Dimension
     */
    public final Button generateButton(
            final SpringLayout layout,
            final Declarator object) {
        Button btn = new Button(object.getName());
        add(btn);
        btn.addActionListener(this);
        layout.putConstraint(
                SpringLayout.WEST,
                btn, object.getPos().x,
                SpringLayout.WEST, this);
        layout.putConstraint(
                SpringLayout.NORTH,
                btn, object.getPos().y,
                SpringLayout.NORTH, this);
        btn.setPreferredSize(
                new Dimension(
                        object.getWidth(),
                        object.getLength()));
        return btn;
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
