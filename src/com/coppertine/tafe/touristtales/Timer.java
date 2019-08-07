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

public class Timer {
    private TimerStatus status;
    private LocalDateTime loggedStartTime;
    private LocalDateTime loggedEndTime;
}
