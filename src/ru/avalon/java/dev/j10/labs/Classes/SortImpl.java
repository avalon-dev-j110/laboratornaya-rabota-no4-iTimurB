package ru.avalon.java.dev.j10.labs.Classes;

import java.util.Arrays;
import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Sort;

public class SortImpl implements Sort {

    @Override
    public void sort(Object[] array) {
        for (int i = 0; array.length > i; i++) {
            for (int j = 1; array.length > j; j++) {
                if (array[j].toString().compareTo(array[j - 1].toString()) > 0) {
                    Object temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }

}
