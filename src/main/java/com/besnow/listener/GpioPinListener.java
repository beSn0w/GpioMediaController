package com.besnow.listener;

import com.besnow.service.GpioService;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class GpioPinListener {

    //getting pins from service
    GpioPinDigitalMultipurpose pin00 = GpioService.getPin00();

    public GpioPinListener() {
        System.out.println("Initialising Listeners...");

        //Listener for Pin 0
        pin00.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 00 = " + event.getState());
            System.out.println("oh hi marc");
        });


    }
}
