package com.protry.cal.entity;

import lombok.AllArgsConstructor;

public class SelfLinkedList<E> {



    @AllArgsConstructor
    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;
    }
}
