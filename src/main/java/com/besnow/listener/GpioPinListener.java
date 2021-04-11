package com.besnow.listener;

import com.besnow.service.GpioService;
import com.besnow.service.InterfaceService;
import com.besnow.service.VideoPlayerService;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class GpioPinListener {

    //getting pins from service
    GpioPinDigitalMultipurpose pin00 = GpioService.getPin00();
    GpioPinDigitalMultipurpose pin01 = GpioService.getPin01();
    GpioPinDigitalMultipurpose pin02 = GpioService.getPin02();
    GpioPinDigitalMultipurpose pin03 = GpioService.getPin03();
    GpioPinDigitalMultipurpose pin04 = GpioService.getPin04();
    GpioPinDigitalMultipurpose pin05 = GpioService.getPin05();


    public GpioPinListener() {
        System.out.println("Initialising Listeners...");

        //Listener for Pin 0
        pin00.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 11 = " + event.getState());
            String path = InterfaceService.getPath1();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });

        pin01.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 12 = " + event.getState());
            String path = InterfaceService.getPath2();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });

        pin02.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 13 = " + event.getState());
            String path = InterfaceService.getPath3();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });

        pin03.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 15 = " + event.getState());
            String path = InterfaceService.getPath4();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });

        pin04.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 16 = " + event.getState());
            String path = InterfaceService.getPath5();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });

        pin05.addListener((GpioPinListenerDigital) event -> {
            System.out.println("Pin 18 = " + event.getState());
            String path = InterfaceService.getPath6();

            if (event.getState().isHigh()) {
                VideoPlayerService.killVideo();
            }

            if (event.getState().isLow()) {
                VideoPlayerService.playVideo(path);
            }
        });
    }
}
