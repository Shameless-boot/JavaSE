package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 21:41
 * @description: Using .new to create instances of Inner class
 */
public class Parcel3 {
    private class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    public class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        // Must use instance of out class to create an instance of inner class
        Parcel3.Contents pc = parcel3.new Contents();
        Parcel3.Destination pd = parcel3.new Destination("Shanghai");
    }
}
