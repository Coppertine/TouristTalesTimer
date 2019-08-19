/*
 * The MIT License
 *
 * Copyright 2019 Coppertine.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.coppertine.tafe.touristtales.settings;

import com.coppertine.tafe.Declarator;
import com.coppertine.tafe.Vector2;
import com.coppertine.tafe.touristtales.Config;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;

/**
 *
 * @author Coppertine
 */
public class Settings {
    /**
     *
     */
    private JSpinner spinHourMax, spinMinMax, spinSecMax;
    private JTextField txtFilePath;
    private Button btnFilePath;

    public final open(final Config inputConfig) {
        // Set up pannel //

        final int hourInputMax = 999;
        final int minInputMax = 60;
        final int secondInputMax = 60;

        SpringLayout layout = new SpringLayout();
        JPanel panel = new JPanel(layout);
        spinHourMax = generateSpinner(layout, new Declarator(
                new SpinnerNumberModel(
                        0, //Initial Input
                        0,
                        hourInputMax,
                        1 //Step
                ), "Maximum Hour", new Vector2(0, 0), 0, 0));
        spinMinMax = generateSpinner(layout, new Declarator(
                new SpinnerNumberModel(
                        0, //Initial Input
                        0,
                        minInputMax,
                        1 //Step
                ), "Maximum Minute", new Vector2(0, 0), 0, 0));
        spinSecMax = generateSpinner(layout, new Declarator(
                new SpinnerNumberModel(
                        0, //Initial Input
                        0,
                        secondInputMax,
                        1 //Step
                ), "Maximum Second", new Vector2(0, 0), 0, 0));

        panel.add(spinHourMax);

        final int result = JOptionPane.showConfirmDialog(
                        null, panel, "Settings", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            return new Config(txtFilePath.getText(),
                                (int)spinHourMax.getValue(),
                                (int)spinMinMax.getValue(),
                                (int)spinSecMax.getValue());
        }
    }

    public final JSpinner generateSpinner(SpringLayout layout, Declarator object) {
        JLabel lbl = new JLabel(object.getName());
        JSpinner spinner = new JSpinner((SpinnerModel)object.getObj());
        lbl.setLabelFor(spinner);
        
    }
}