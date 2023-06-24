package com.mycompany.assignment_3;

public  class MaxHeap<T extends Comparable<T>> {
    T[] heap;
    int size;
    int maxsize;
    
 
    // Constructor to initialize an
    // empty max heap with given maximum
    // capacity
    public MaxHeap(int maxsize)
    {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        heap = (T[]) new Comparable[maxsize];
    }
 
    // Method 1
    // Returning position of parent
    private int parent(int pos) { return (pos - 1) / 2; }
 
    // Method 2
    // Returning left children
    private int leftChild(int pos) { return (2 * pos) + 1; }
 
    // Method 3
    // Returning right children
    private int rightChild(int pos)
    {
        return (2 * pos) + 2;
    }
 
    // Method 4
    // Returning true if given node is leaf
    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
 
    // Method 5
    // Swapping nodes
    private void swap(int fpos, int spos)
    {
        T tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }
 
    // Method 6
    // Recursive function to max heapify given subtree
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;
 
        if (heap[pos].compareTo(heap[leftChild(pos)]) < 0
            || heap[pos].compareTo(heap[rightChild(pos)])<0) {
 
            if (heap[leftChild(pos)].compareTo(heap[rightChild(pos)])>0) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }
    // Method 7
    // Inserts a new element to max heap
    public void insert(T element)
    {
        heap[size] = element;
 
        // Traverse up and fix violated property
        int current = size;
        while (heap[current].compareTo(heap[parent(current)]) > 0) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
 
   
    
 
    // Method 8
    // To display heap
    public void print()
    {
 
        for (int i = 0; i < size / 2; i++) {
 
            System.out.print("Parent Node : " + heap[i]);
 
            if (leftChild(i)
                < size) // if the child is out of the bound
                        // of the array
                System.out.print(" Left Child Node: "
                                 + heap[leftChild(i)]);
 
            if (rightChild(i)
                < size) // the right child index must not
                        // be out of the index of the array
                System.out.print(" Right Child Node: "
                                 + heap[rightChild(i)]);
 
            System.out.println(); // for new line
        }
    }
 
    // Method 9
    // Remove an element from max heap
    public T extractMax()
    {
        T popped = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return popped;
    }
 
   
} 
    

