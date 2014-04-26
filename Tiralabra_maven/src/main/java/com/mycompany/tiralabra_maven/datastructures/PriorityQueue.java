package com.mycompany.tiralabra_maven.datastructures;

public class PriorityQueue<T> {

    private final AbstractHeap<T> heap;

    public PriorityQueue(AbstractHeap<T> heap) {
        this.heap = heap;
    }

    public void enqueue(T t) {
        heap.insert(t);
    }

    public T dequeue() {
        return heap.extractTop();
    }

    public int size() {
        return heap.heapsize();
    }

    public boolean contains(T t) {
        return heap.contains(t);
    }

    public void remove(T t) {
        heap.remove(t);
    }
    
    public static PriorityQueue createMinPriorityQueue() {
        return new PriorityQueue(new MinHeap());
    }
    
    public static PriorityQueue createMaxPriorityQueue() {
        return new PriorityQueue(new MaxHeap());
    }

    public boolean isEmpty() {
        return heap.heapsize == 0;
    }
}
