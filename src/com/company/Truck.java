package com.company;

public final class  Truck extends PassengerCar {

  private int volume;
    private Color color;

    public Truck(int volume, Color color) {
        super(volume, color);
    }

    public Truck(int volume, Color color, int year) {
        super(volume, color, year);
    }


    public int getVolume() {
        return volume;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("buuuup");
    }
}







