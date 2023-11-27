package com.geektrust.course_scheduling;

import java.util.HashMap;
import java.util.Map;

public class LFUCache<K,V> {

    class Entry {
        private K key;

        private V value;

        private int count;

        private Entry next;

        private Entry prev;

        public Entry(){

        }

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public Entry getPrev() {
            return prev;
        }

        public void setPrev(Entry prev) {
            this.prev = prev;
        }

    }

    class DList {

        private Entry head;

        private Entry tail;

        private int size;

        public DList(){
            head = new Entry();
            tail = new Entry();

            head.next = tail;
            tail.prev = head;
        }

        void add(Entry node) {
            head.next.prev = node;
            node.next = head.next;
            node.prev = head;
            head.next = node;
            size++;
        }

        void remove(Entry node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Entry removeLast() {
            if (size > 0) {
                Entry node = tail.prev;
                remove(node);
                return node;
            }
            else return null;
        }

    }

    int capacity, size, min;

    Map<K, Entry> entryMap;

    Map<Integer, DList> countMap;


    public LFUCache(int capacity){
        this.capacity = capacity;
        this.entryMap = new HashMap<>();
        this.countMap = new HashMap<>();
    }

    public V get(K key){
        Entry entry = entryMap.get(key);

        update(entry);

        if(entry!=null){
            return entry.value;
        }

        return null;
    }

    public void set(K key, V value){
        if(capacity==0) return;

        if(entryMap.containsKey(key)){
            Entry entry = entryMap.get(key);
            entry.setValue(value);
            update(entry);
        } else {
            Entry entry = new Entry(key, value);
            entry.setCount(1);
            entryMap.put(key, entry);

            if(size==capacity){
                DList dList = countMap.get(min);
                entryMap.remove(dList.removeLast().key);
                size--;
            }

            size++;
            min = 1;
            DList dList = countMap.getOrDefault(entry.getCount(), new DList());
            dList.add(entry);
            countMap.put(entry.getCount(), dList);
        }

    }

    public void update(Entry entry){
        DList oldList = countMap.get(entry.getCount());
        oldList.remove(entry);

        if(entry.getCount()==min && oldList.size==0){
            min++;
        }

        entry.setCount(entry.getCount()+1);

        DList newList = countMap.getOrDefault(entry.getCount(), new DList());
        newList.add(entry);
        countMap.put(entry.getCount(), newList);
    }

    public static void main(String[] args){
        LFUCache<Integer, Integer> lfuCache = new LFUCache(1);
        lfuCache.set(5, 45);
        lfuCache.get(5);
    }
}
