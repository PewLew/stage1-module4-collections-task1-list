package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                list.addLast(integer);
            } else
                list.addFirst(integer);
        }
        return list;
    }
}
