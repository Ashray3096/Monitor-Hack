package com.demo;

import java.awt.*;
import java.util.*;
public class MonitorHack{

    public static void main(String[] args) throws Exception{
        Robot MonitorHack = new Robot();
        Random random = new Random();
        while(true){
            MonitorHack.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            MonitorHack.mouseMove(x,y);
        }
    }
}
