package com.kerwim.StackDetail;

/**
 *
 */
public class StackDemo {

    private int arr[];
    private int top;
    private int capacity;

    StackDemo(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("溢出\n程序终止\n");
            System.exit(1);
        }

        System.out.println("压入 " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("栈是空的");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\n弹出元素后");

        stack.printStack();
    }
}


