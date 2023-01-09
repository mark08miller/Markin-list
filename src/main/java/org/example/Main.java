package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new MarkinList<>();
        strings.add("Hello");
        strings.add("Four");
        strings.add("Last");
        strings.add("Fast");
        strings.delete(1);
        System.out.println(strings.get(1));

    }
}