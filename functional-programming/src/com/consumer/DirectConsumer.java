package com.consumer;

import com.sorting.algorithm.BubbleSort;
import com.sorting.util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
    private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());
    public static void main(String[] args) {
        BubbleSort util = new BubbleSort();
        List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Eve", "Adam"));
        logger.info(sorted.toString());
    }
}
