package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-26 14:54
 * @description: TODO
 */
public class Parcel11 {
    private static class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static final class PDestination implements Destination {
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f() {

        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {

            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new PDestination(s);
    }

    public static Contents contents() {
        return new PContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination destination = destination("Shanghai");
    }
}
