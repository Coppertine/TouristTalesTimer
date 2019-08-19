/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coppertine.tafe.touristtales;

import com.coppertine.tafe.Declarator;
import com.coppertine.tafe.InfoLibrary;
import com.coppertine.tafe.Vector2;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
     * Global Labels used within program.
     */
    private Label lblStart, lblEnd;

    /**
     * Timer object for keeping temporary data before storing to the sheet.
     */
    private Timer timerMain;

    /**
     * Configuration Object.
     */
    private Config globalConfig;

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
        this.timerMain = new Timer();
        this.globalConfig = new Config();

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
        renderText(layout);
    }

    /**
     * Creates and renders buttons used within this GUI.
     * @param layout SpringLayout
     */
    public final void renderButtons(final SpringLayout layout) {
        final int buttonHeight = 25;
        final int buttonLength = 80;

        final Vector2 btnStartPosition = new Vector2(15, 200);
        btnStart = generateButton(
                layout,
                new Declarator(
                        btnStart,
                        "Start",
                        btnStartPosition,
                        buttonLength,
                        buttonHeight)
                );
        final Vector2 btnStopPosition = new Vector2(105, 200);
        btnStop = generateButton(
                layout,
                new Declarator(
                        btnStop,
                        "Stop",
                        btnStopPosition,
                        buttonLength,
                        buttonHeight)
                );
        final Vector2 btnSettingsPosition = new Vector2(105, 200);
        btnSettings = generateButton(
                layout,
                new Declarator(
                        btnSettings,
                        "Stop",
                        btnSettingsPosition,
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

    /**
     *
     * @param layout SpringLayout of frame
     */
    public final void renderText(final SpringLayout layout) {
        final int labelWidth = 250;
        final int labelHeight = 12;
        final Vector2 lblStartPosition = new Vector2(50, 50);
        lblStart = generateLabel(
                layout,
                new Declarator(
                    lblStart,
                    "Start Time:",
                    lblStartPosition,
                    labelWidth,
                    labelHeight
                )
        );

        final Vector2 lblEndPosition = new Vector2(50, 80);
        lblEnd = generateLabel(
                layout,
                new Declarator(
                    lblStart,
                    "End Time:",
                    lblEndPosition,
                    labelWidth,
                    labelHeight
                )
        );
    }

    /**
     *
     * @param layout SpringLayout of frame
     * @param object Declarator of object
     * @return Button
     */
    public final Label generateLabel(
            final SpringLayout layout,
            final Declarator object) {
        Label lbl = new Label(object.getName());
        add(lbl);
        layout.putConstraint(
                SpringLayout.NORTH,
                lbl, object.getPos().y,
                SpringLayout.NORTH, this);
        lbl.setPreferredSize(
                new Dimension(
                        object.getWidth(),
                        object.getLength()));
        return lbl;

    }

    /**
     *
     */
    public final void toggleTimer() {
        if (timerMain.getStatus() == TimerStatus.Stopped) {
            timerMain.startTimer();
            lblStart.setText("Start Time: "
                    + timerMain.getLoggedStartTime()
                            .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        } else {
            timerMain.endTimer();
            lblEnd.setText("End Time: "
                    + timerMain.getLoggedEndTime()
                            .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            try {
                System.out.println("Writing File");
                logDuration();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
    /**
     *
     * @throws java.io.IOException if errors are found
     * when reading or writing to file.
     */
    public final void logDuration()
            throws IOException {
        if (!globalConfig.compareTimes(
                timerMain.getLoggedStartTime(),
                timerMain.getLoggedEndTime())) {
            try {
                final ArrayList<String> currentFileContents =
                        InfoLibrary.readFile(globalConfig.getStrFilePath());

                currentFileContents.add(timerMain.toString());

                InfoLibrary.writeFile(
                        globalConfig.getStrFilePath(),
                        true, currentFileContents);
            } catch (IOException e) {
                throw e;
            }
        }
    }

    @Override
    public final void actionPerformed(final ActionEvent e) {
        if (e.getSource() == btnStart) {
            toggleTimer();
        }
        if (e.getSource() == btnStop) {
            toggleTimer();
        }
        if (e.getSource() == btnSettings) {
            //
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
