package com.sean.onjava8.innerclasses;

/**
 * @author: Shaun
 * @create: 2020-04-24 22:15
 * @description: TODO
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSkip {
                private String id;

                public TrackingSkip(String id) {
                    this.id = id;
                }

                String getSkip() {
                    return id;
                }
            }

            TrackingSkip ts = new TrackingSkip("slip");
            String s = ts.getSkip();
        }

        // 此内部类只存在于internalTracking()方法中
        // TrackingSkip ts = new TrackingSkip("slip");
    }

    public void track() {
        internalTracking(true);
    }
    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();

    }
}
