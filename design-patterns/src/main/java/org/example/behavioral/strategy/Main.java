package org.example.behavioral.strategy;

import org.example.behavioral.strategy.sort.BubbleSortStrategy;
import org.example.behavioral.strategy.sort.QuickSortStrategy;
import org.example.behavioral.strategy.sort.SelectionSortStrategy;

public class Main {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        int[] numbers = {5, 2, 9, 1, 5, 6};

        context.setSortStrategy(new BubbleSortStrategy());
        context.sortArray(numbers);
        printArray(numbers);

        context.setSortStrategy(new SelectionSortStrategy());
        context.sortArray(numbers);
        printArray(numbers);

        context.setSortStrategy(new QuickSortStrategy());
        context.sortArray(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
