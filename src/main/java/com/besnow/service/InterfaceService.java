package com.besnow.service;

import com.besnow.Main;

import java.util.Scanner;

public class InterfaceService {

    private final Scanner input = new Scanner(System.in);

    private static String path1 = "";
    private static String path2 = "";
    private static String path3 = "";
    private static String path4 = "";
    private static String path5 = "";
    private static String path6 = "";

    public InterfaceService() {
        //Yes i know this is a lot of reused code, im just being a bit lazy here.

        //little guide on how to use.
        System.out.println("GpioMediaController " + Main.VERSION + " - by beSnow\n");
        System.out.println("This program is work in progress. Interface is not final.");
        System.out.println("Testing incomplete, please report any bugs to: https://github.com/beSn0w/GpioMediaController/issues\n");
        System.out.println("Enter the path of your video's below. (Leave path empty if not used)\n");

        //start asking questions
        System.out.print("Enter path of first video: ");
        path1 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 11\n\n");

        System.out.print("Enter path of second video: ");
        path2 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 12\n\n");

        System.out.print("Enter path of third video: ");
        path3 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 13\n\n");

        System.out.print("Enter path of fourth video: ");
        path4 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 15\n\n");

        System.out.print("Enter path of fifth video: ");
        path5 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 16\n\n");

        System.out.print("Enter path of sixth video: ");
        path6 = input.nextLine();
        System.out.print("Video assigned to GPIO pin 18\n\n");
    }

//    public void InputLine(String number, String path, String pin) {
//        System.out.println("Enter path of " + number + "video: ");
//        path = input.nextLine();
//        System.out.println("Video assigned to GPIO pin " + pin + "\n\n");
//    }


    public static String getPath1() {
        return path1;
    }

    public static String getPath2() {
        return path2;
    }

    public static String getPath3() {
        return path3;
    }

    public static String getPath4() {
        return path4;
    }

    public static String getPath5() {
        return path5;
    }

    public static String getPath6() {
        return path6;
    }
}
