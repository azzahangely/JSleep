package com.AzzahJSleepFN;

public class ThreadingObject extends Thread {
    public ThreadingObject(String name){
        super(name);
        this.start();
    }
    public void run(){
        System.out.println(this.getName() + " is running");
        System.out.println("Id Thread " + this.getId());
    }
}

