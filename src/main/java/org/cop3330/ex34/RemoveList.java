package org.cop3330.ex34;

import java.util.ArrayList;

public class RemoveList {
    private ArrayList<String> list;

    public RemoveList(String[] arr) {
        list = new ArrayList<>();
        for (String s : arr)
            list.add(s);
    }

    public void remove(String s) {
        list.remove(s);
    }

    @Override
    public String toString() {
        String output = String.format("There are %d employees:", list.size());
        for (String s : list)
            output += "\n" + s;

        return output;
    }
}
