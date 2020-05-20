package com.sean.mashibin.generic;

import java.io.Serializable;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg < K extends String & Serializable,Q>{
    /**
     * Get the minimum and maximum of an array of strings.
     * @param words an array of strings
     * @return a  pair with the min and max value, or null if words is null or empty
     */
    public static Pair<String> minmax(String[] words) {
        if (words == null || words.length == 0)
            return null;
        String max = words[0], min = words[0];
        for (String word : words) {
            if (max.compareTo(word) < 0)
                max = word;
            if (min.compareTo(word) > 0)
                min = word;
        }
        return new Pair<>(min, max);
    }
}
