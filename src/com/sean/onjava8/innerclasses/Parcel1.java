package com.sean.onjava8.innerclasses;

public class Parcel1 {
    class Contents {
        private int i = 11;
        public final static int j = 100;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }


    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("Shanghai");
    }
}


