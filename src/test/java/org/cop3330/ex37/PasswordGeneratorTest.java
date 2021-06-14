package org.cop3330.ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd'));
    ArrayList<Character> arrClone = (ArrayList<Character>) arr.clone();

    ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> intArrClone = (ArrayList<Integer>) intArr.clone();

    PasswordGenerator pg = new PasswordGenerator(10, 4, 4);

    @Test
    void pickRandom() {
        pg.pickRandom(arr);
        assertArrayEquals(arr.toArray(), arrClone.toArray());
    }

    @Test
    void pickRandomAndRemove() {
        pg.pickRandomAndRemove(intArr);
        assertFalse(intArr.size() == intArrClone.size());
    }
}