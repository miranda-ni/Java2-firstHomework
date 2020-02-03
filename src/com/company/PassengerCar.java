package com.company;

public class PassengerCar extends Car {
    private int year;
    private int speed;

    public PassengerCar(int volume, Color color) {
        super(volume, color);
    }

    public PassengerCar(int volume, Color color, int year) {
        super(volume, color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }
    public void voice(){
        System.out.println("Beep-Beep");
    }
    public final void makeLight(){
        System.out.println("Свет");

    }

}

