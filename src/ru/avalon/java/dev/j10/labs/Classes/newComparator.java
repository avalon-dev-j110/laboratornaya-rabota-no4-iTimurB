package ru.avalon.java.dev.j10.labs.Classes;

import java.util.Comparator;

public class newComparator implements Comparator<String> {

    @Override
    public int compare(String t, String t1) {
        String str1 = (String) t;
        String str2 = (String) t1;
        if (str1.compareTo(str2) > 0) {
            return -1;
        }
        else if (str1.compareTo(str2) < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
