package org.behavioral.strategy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter implements Strategy {
    @Override
    public ArrayList<?> ordina(ArrayList<?> arrayList) {
        getTypeOfList(arrayList);

        Comparator<String> stringComparator = String::compareTo;

        arrayList = arrayList
                .stream()
                .map(elemento -> (String) elemento)
                .sorted(stringComparator)
                .collect(Collectors.toCollection(ArrayList::new));

        return arrayList;
    }

    private static <T> void getTypeOfList(List<T> list) {
        Type listType = list.get(0).getClass();

        if(listType.equals(String.class))
            return;

        throw new IllegalArgumentException("Lista non String...");
    }
}
