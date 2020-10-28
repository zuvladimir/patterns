package com.mycompany.templatemethod;

/**
 * Абстрактный класс, который содержит шаблонный метод, инкапсулирующий алгоритм
 * сортировки Пузырьком.
 *
 * @author Vladimir
 */
public abstract class BubbleSort {

    public static enum SortType {
        ASC,
        DESC;
    }

    /**
     * Сортировка по возрастанию или по убыванию.
     *
     * Шаблонный метод - sortAsc(), в котором используется compareTo() в
     * качестве шага алгоритма, реализация которого должна быть представлена в
     * субклассах, реализующих интерфейс Comparable.
     *
     * P.S. Несмотря на то, что диаграмма классов не совсем стандартная для
     * Шаблонного метода, данный подход может называться шаблонным методом.
     *
     * @param arr
     * @param type
     */
    public static void sort(Comparable[] arr, SortType type) {
        while (true) {
            boolean flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if ((type.equals(SortType.ASC) && arr[i].compareTo(arr[i + 1]) > 0)
                        || (type.equals(SortType.DESC) && arr[i].compareTo(arr[i + 1]) < 0)) {
                    Comparable obj = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = obj;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
