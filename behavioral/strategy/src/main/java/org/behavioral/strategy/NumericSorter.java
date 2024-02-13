package org.behavioral.strategy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumericSorter implements Strategy {
    public NumericSorter() {
    }

    Comparator<Number> numberComparator = Comparator.comparingDouble(Number::doubleValue);

    @Override
    public ArrayList<?> ordina(ArrayList<?> arrayList) {
        getTypeOfList(arrayList);

        arrayList = arrayList
                .stream()
                .map(elemento -> (Number) elemento)
                .sorted(numberComparator)
                .collect(Collectors.toCollection(ArrayList::new));

        return arrayList;
    }

    private static <T> void getTypeOfList(List<T> list) {
        Type listType = list.get(0).getClass().getGenericSuperclass();

        if(listType.equals(Number.class))
            return;

        throw new IllegalArgumentException("Lista non numerica...");
    }
}
