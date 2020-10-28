package com.mycompany.templatemethod;

import java.util.Arrays;

/**
 * Шаблонный метод - задает скелет алгоритма в методе, оставляя определение
 * реализации некоторых шагов субклассам. Субклассы могут переопределять
 * некоторые части алгоритма без изменения его структуры.
 *
 * Фабричный метод является специализированной версией Шаблонного метода.
 *
 * @author Vladimir
 */
public class Main {

    public static void main(String... args) {
        User[] users = {
            new User("Emitrii"),
            new User("Ctazz"),
            new User("Admin"),
            new User("Badov"),
            new User("Duest")
        };

        // алгоритм сортировки пузырьком с шаблонны методом
        BubbleSort.sort(users, BubbleSort.SortType.ASC);

        // Выводим результаты сортировки
        Arrays.asList(users).forEach(user -> System.out.println(user.getLogin()));

        // Обратная сортировка
        System.out.println("=================================================");
        BubbleSort.sort(users, BubbleSort.SortType.DESC);
        Arrays.asList(users).forEach(user -> System.out.println(user.getLogin()));
    }
}
