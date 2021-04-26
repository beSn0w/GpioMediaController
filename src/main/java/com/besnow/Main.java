package com.besnow;

import com.besnow.listener.GpioPinListener;
import com.besnow.service.InterfaceService;

public class Main {

    public static String VERSION = "0.1.0";

    public static void main(String[] args) {

        InterfaceService interfaceService = new InterfaceService();

        initListeners();

        InterfaceService.readyMessage();

    }

    private static void initListeners() {

        GpioPinListener gpioPinListener = new GpioPinListener();

    }
}
