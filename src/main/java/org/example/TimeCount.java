package org.example;

public class TimeCount {
    public void timecount(){
        int sec=86399;

        int H=(sec/3600);
        int M=((sec/60))%60;
        int S=((sec%60));

        System.out.println(H+":"+M+":"+S);
    }
}
