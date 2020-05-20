package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 21:58
 * @description: TODO
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;

        public PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

class Parcel {
    public static void main(String[] args) {
        Parcel4 p4 = new Parcel4();
        Contents contents = p4.contents();
        Destination destination = p4.destination("Shanghai");
        //Parcel4.PContents pc = p4.new PContents();
        Parcel4.PDestination pp = p4.new PDestination("a");
    }
}
