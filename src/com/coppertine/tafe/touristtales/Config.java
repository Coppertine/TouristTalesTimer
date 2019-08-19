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
package com.coppertine.tafe.touristtales;

/**
 *
 * @author Coppertine
 */
public class Config {
    /**
     *
     */
    private String strFilePath;
    /**
     *
     */
    private int intHourMax;
    /**
     *
     */
    private int intMinMax;
    /**
     *
     */
    private int intSecondMax;

    /**
     * Empty Contsructer uses default values.
     */
    public Config() {
        strFilePath = "log.csv";
        intHourMax = 0;
        final int minMax = 5;
        intMinMax = minMax; // 5 Minutes Default
        intSecondMax = 0;
    }

    /**
     * Gets file path spesified from program.
     * @return String file path.
     */
    public final String getStrFilePath() {
        return strFilePath;
    }

    /**
     * sets the file path of the program.
     * @param filePath File Path String to set.
     */
    public final void setStrFilePath(final String filePath) {
        this.strFilePath = filePath;
    }

    /**
     * Gets maximum hour to log user's time.
     * @return integer Hour.
     */
    public final int getIntHourMax() {
        return intHourMax;
    }

    /**
     * Sets specified maximum hour to program.
     * @param hourMax integer.
     */
    public final void setIntHourMax(final int hourMax) {
        this.intHourMax = hourMax;
    }

    /**
     * Gets maximum minute for time to be logged.
     * @return integer maximum minutes.
     */
    public final int getIntMinMax() {
        return intMinMax;
    }

    /**
     * Sets maximum minute for time to be logged.
     * @param minMax integer maximum minute
     */
    public final void setIntMinMax(final int minMax) {
        this.intMinMax = minMax;
    }

    /**
     * Gets maximum seconds.
     * @return integer maximum second.
     */
    public final int getIntSecondMax() {
        return intSecondMax;
    }

    /**
     * sets maximum second.
     * @param secondMax integer of maximum second.
     */
    public final void setIntSecondMax(final int secondMax) {
        this.intSecondMax = secondMax;
    }

}
