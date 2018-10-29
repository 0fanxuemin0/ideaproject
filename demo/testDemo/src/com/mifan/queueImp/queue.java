package com.mifan.queueImp;

/**
 * Created by fanxuemin on 2018/6/30.
 */
public class queue<T> {
    private Object[] A = new Object[10];
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int length(){
      return size;
    }

    public void push(T t) {
        if(size<10) {
            A[size++] = t;
        }
        else{
            throw new RuntimeException("长度超出限制");
        }
    }

    public T pull() {
        if (!isEmpty()) {
            T t = (T) A[0];
            for (int i = 0; i < size - 1; i++) {
                A[i] = A[i + 1];
            }
            A[size - 1] = null;
            size--;
            return t;
        }
        else{
            return null;
        }
    }
}
