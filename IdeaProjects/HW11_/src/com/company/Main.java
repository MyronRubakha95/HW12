package com.company;

class Main {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new TrackWrap(new MyTrack()));


    }
}

