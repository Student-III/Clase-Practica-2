
package com.mycompany.metodosmixtos;


public interface IList<t> {
    void add(t t);
    void add(t t, int index);
    t remove(int index);
    t get(int index);
    int size();
    void clear();
    boolean isEmpty();
    void deleteDouble(t ex);
    void rotate();
    void concatenar(LinkedList<t> l1,LinkedList<t> l2);
}
