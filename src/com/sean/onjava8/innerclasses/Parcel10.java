package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 23:34
 * @description: TODO
 */
public class Parcel10 {
    public Destination destination(String des, float price) {
        return new Destination() {
            private String dest = des;

            {
                int cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget!!!");
            }

            @Override
            public String readLabel() {
                return this.dest;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination shanghai = parcel10.destination("Shanghai", 101.3956f);
        System.out.println(shanghai.readLabel());
    }
}
