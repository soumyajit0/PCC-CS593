import java.util.*;
import java.lang.*;
import java.io.*;

public class GenericStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 5;
        String[] st = new String[MAX];
        GenSimpleStack<String> stack = new GenSimpleStack<String>(st);
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    System.exit(1);
                case 1:
                    try {
                        stack.push(sc.next());
                    } catch (StackFullException e) {
                        System.out.print(e);
                    }
                    break;
                case 2:
                    try {
                        stack.pop();
                    } catch (StackEmptyException e) {
                        System.out.print(e);
                    }
                    break;
            }
        }
    }
}

interface IGenSimpleStack<T> {
    public void push(T item) throws StackFullException;

    public void pop() throws StackEmptyException;

    public boolean isEmpty();

    public boolean isFull();
}

class GenSimpleStack<T> implements IGenSimpleStack<T> {
    T[] data;
    int tos;

    GenSimpleStack(T[] ds) {
        this.data = ds;
        tos = 0;
    }

    public void push(T item) throws StackFullException {
        if (isFull())
            throw new StackFullException(data.length);
        data[tos] = item;
        tos++;
    }

    public void pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException();
        tos--;
        System.out.print(data[tos] + " ");
    }

    public boolean isFull() {
        return tos == data.length;
    }

    public boolean isEmpty() {
        return tos == 0;
    }
}

class StackFullException extends Exception {
    int size;

    StackFullException(int s) {
        super("StackFull");
        size = s;
    }

    public String toString() {
        return ("[Full-5] ");
    }

}

class StackEmptyException extends Exception {
    StackEmptyException() {
        super("StackEmpty");
    }

    public String toString() {
        return ("[Empty] ");
    }
}
