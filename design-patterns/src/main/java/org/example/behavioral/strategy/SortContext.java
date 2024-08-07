package org.example.behavioral.strategy;

import org.example.behavioral.strategy.sort.SortStrategy;

public class SortContext {
    private SortStrategy strategy;

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] numbers) {
        strategy.sort(numbers);
    }
}
