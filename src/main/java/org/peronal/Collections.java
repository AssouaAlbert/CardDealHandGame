package org.peronal;

import java.util.List;
import java.util.Random;

public class Collections {
    static  <E> void swap(List<E> l, int x, int y) {
        E tmp = l.get(x);
        l.set(x, l.get(y));
        l.set(y, tmp);
    }
    static void shuffle(List<?> a, Random b) {
        for (int i = a.size(); i >= 1; i--) {
            swap(a, i - 1, b.nextInt(i));
        }
    }
}
