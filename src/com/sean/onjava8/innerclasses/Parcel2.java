package com.sean.onjava8.innerclasses;

public class Parcel2 {
    class Contents {
        private int i = 11;

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

    public Contents contents() {
        return new Contents();
    }

    public Destination to(String dest) {
        return new Destination(dest);
    }

    public void ship(String dest) {
        Contents contents = contents();
        Destination destination = to(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 parcel1 = new Parcel2();
        parcel1.ship("Shanghai");
        Parcel2.Contents c = parcel1.contents();
        Parcel2.Destination d = parcel1.to("Beijing");
    }
}
