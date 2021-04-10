package com.besnow.service;

import com.pi4j.io.gpio.*;

public class GpioService {

    private static final GpioController gpio = GpioFactory.getInstance();

    private static final GpioPinDigitalMultipurpose pin00 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_00, PinMode.DIGITAL_INPUT);
    private static final GpioPinDigitalMultipurpose pin01 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_01, PinMode.DIGITAL_INPUT);
    private static final GpioPinDigitalMultipurpose pin02 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_02, PinMode.DIGITAL_INPUT);
    private static final GpioPinDigitalMultipurpose pin03 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_03, PinMode.DIGITAL_INPUT);
    private static final GpioPinDigitalMultipurpose pin04 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_04, PinMode.DIGITAL_INPUT);
    private static final GpioPinDigitalMultipurpose pin05 = gpio.provisionDigitalMultipurposePin(RaspiPin.GPIO_05, PinMode.DIGITAL_INPUT);


//    //methods
//    public static void startInputPin() {
//
//        final GpioPinDigitalInput pin02 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);
//
//    }
//
//    public static void startOutputPin() {
//
//        final GpioPinDigitalOutput pin02 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, PinState.HIGH);
//        pin02.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
//    }


    //Getters
    public static GpioController getGpio() {
        return gpio;
    }

    public static GpioPinDigitalMultipurpose getPin00() {
        return pin00;
    }
    public static GpioPinDigitalMultipurpose getPin01() {
        return pin01;
    }
    public static GpioPinDigitalMultipurpose getPin02() {
        return pin02;
    }
    public static GpioPinDigitalMultipurpose getPin03() {
        return pin03;
    }
    public static GpioPinDigitalMultipurpose getPin04() {
        return pin04;
    }
    public static GpioPinDigitalMultipurpose getPin05() {
        return pin05;
    }


    //No touchy
    public static void stopGpio() {
        gpio.shutdown();
    }
}
