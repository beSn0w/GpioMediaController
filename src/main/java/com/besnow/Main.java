package com.besnow;

import com.besnow.listener.GpioPinListener;

public class Main {

    public static void main(String[] args) {

        initListeners();

    }

    private static void initListeners() {

        GpioPinListener gpioPinListener = new GpioPinListener();

    }
}
