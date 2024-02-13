package org.behavioral;

import org.behavioral.strategy.NumericSorter;
import org.behavioral.strategy.StringSorter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static NumericSorter numericSorter = new NumericSorter();
    static StringSorter strSorter = new StringSorter();
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(List.of("Topazio", "Gianni", "Carlo", "Luca"));
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(89, 1, 29272, 444, 432, 57));

        integerArrayList = (ArrayList<Integer>) numericSorter.ordina(integerArrayList);
        stringArrayList = (ArrayList<String>) strSorter.ordina(stringArrayList);

        System.out.println(integerArrayList);
        System.out.println(stringArrayList);
    }
}