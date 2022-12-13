package com.razin.vadim;

public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Rap is God";
    }

    public void doInit() {
        System.out.println("Init method for prototype bean");
    }

    public void doDestroy() {
        System.out.println("Destroy method for prototype bean");
    }
}
