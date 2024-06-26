package com.example.basic.lesson9.exercise;

import java.util.Iterator;

public class IterableString implements Iterable<Character> {
    private String original;

    public IterableString(String original) {
        this.original = original;
    }

    public Iterator<Character> iterator() {
        return new InnerIterator();
    }

    public class InnerIterator implements Iterator<Character> {
        private int index;
        public boolean hasNext() {
            return index < original.length();
        }

        public Character next() {
            var c = original.charAt(index);
            index++;
            return c;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
