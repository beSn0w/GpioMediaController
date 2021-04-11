package com.besnow.service;

import java.io.IOException;
import java.util.HashSet;

public class VideoPlayerService {

    private static final ProcessBuilder processBuilder = new ProcessBuilder();

    private static final HashSet<Long> pidArray = new HashSet<>();

    public static void playVideo(String videoPath) {
        try {
            processBuilder.command("bash", "-c", "omxplayer --loop --no-osd " + videoPath);
            Process process = processBuilder.start();
            pidArray.add(process.pid());
            System.out.println("new process opened with pid: " + process.pid());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void killVideo() {
        if (pidArray.isEmpty()) return;
        try {
            processBuilder.command("bash", "-c", "pkill -9 -f omxplayer");
//            Runtime.getRuntime().exec("pkill -9 -f omxplayer");
            processBuilder.start();
            System.out.println("process killed");
            System.out.println(pidArray);
            pidArray.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
