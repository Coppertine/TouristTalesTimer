/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coppertine.tafe.touristtales;

import java.time.LocalDateTime;

/**
 *
 * @author Coppertine
 */

enum TimerStatus { Running, Stopped };

/**
 *
 * @author Coppertine
 */
public class Timer {
    /**
     *
     */
    private TimerStatus status;
    /**
     *
     */
    private LocalDateTime loggedStartTime;
    /**
     *
     */
    private LocalDateTime loggedEndTime;



    /**
     * Empty Constructor.
     */
    public Timer() {
    }

    /**
     * Constructor of the Timer object.
     * @param timerStatus TimerStatus enumerator.
     * @param loggedStart Start LocalDateTime.
     * @param loggedEnd End LocalDateTime.
     */
    public Timer(
            final TimerStatus timerStatus,
            final LocalDateTime loggedStart,
            final LocalDateTime loggedEnd) {
        this.status = timerStatus;
        this.loggedStartTime = loggedStart;
        this.loggedEndTime = loggedEnd;
    }

    /**
     *
     * @return TimerStatus enumerator
     * @see TimerStatus
     */
    public final TimerStatus getStatus() {
        return status;
    }

    /**
     *
     * @param timerStatus TimerStatus enumerator
     */
    public final void setStatus(final TimerStatus timerStatus) {
        this.status = timerStatus;
    }

    /**
     *
     * @return LocalDateTimer Start DateTime.
     */
    public final LocalDateTime getLoggedStartTime() {
        return loggedStartTime;
    }

    /**
     * Starts the timer by copying the LocalDateTime from the users computer.
     */
    public final void startTimer() {
        this.loggedStartTime = LocalDateTime.now();
    }

    /**
     *
     * @return LocalDateTime
     */
    public final LocalDateTime getLoggedEndTime() {
        return loggedEndTime;
    }

    /**
     * Sets the Log End Time.
     *
     */
    public final void endTimer() {
        this.loggedEndTime = LocalDateTime.now();
    }

}
