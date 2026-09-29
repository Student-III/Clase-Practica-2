package com.mycompany.metodosmixtos;

public class LinkedList<t> implements IList<t> {

    private Node<t> first;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    @Override
    public void add(t t) {
        Node<t> node = new Node<t>(t);
        if (isEmpty()) {
            first = node;
        } else {
            Node<t> cursor = first;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
        }
        size++;
    }

    @Override
    public void add(t t, int index) {
        if (index >= 0 && index <= size) {
            if (index == 0) {
                first = new Node<t>(t, first);
            } else {
                Node<t> cursor = first;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                Node<t> node = new Node<t>(t);
                node.setNext(cursor.getNext());
                cursor.setNext(node);
            }
            size++;

        } else {
            throw new UnsupportedOperationException("Fuera de rango");
        }
    }

    @Override
    public t remove(int index) {
        if (index > 0 && index < size) {
            Node<t> aux;
            if (index == 0) {
                aux = first;
                first = first.getNext();
            } else {
                Node<t> cursor = first;
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNext();
                }
                aux = cursor.getNext();
                cursor.setNext(aux.getNext());
            }
            size--;
            return aux.getInfo();
        } else {
            throw new UnsupportedOperationException("Numero fuera de rango ");
        }

    }

    @Override
    public t get(int index) {
        if (index >= 0 && index < size) {
            Node<t> cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.getNext();
            }
            return cursor.getInfo();
        } else {
            throw new UnsupportedOperationException("Fuera de rango");
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void deleteDouble(t ex) {
        
        if (first == null) {
            throw new UnsupportedOperationException("La lista esta vacia");
        }

        while (first != null && first.getInfo().equals(ex)) {
            first = first.next;
            size--;
        }

        if (first == null) {
            throw new UnsupportedOperationException("La lista quedo vacia luego de eliminar los elementos repetidos");
        }

        Node<t> cursor = first;
        while (cursor.next != null) {
            if (cursor.next.getInfo().equals(ex)) {
                cursor.next = cursor.next.next;
                size--;
            } else {
                cursor = cursor.next;
            }
        }
    }

    @Override
    public void rotate() {
        Node<t> cursor = first;
        Node<t> aux = first;
        if (first == null) {
            throw new UnsupportedOperationException("La lista esta vacia.");
        }
        if (first.next == null) {
            throw new UnsupportedOperationException("Solo hay un elemento  en la lista.");
        } else {
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    first = cursor;
                    first.next = aux;
                } else {
                    cursor = cursor.next;
                }

            }
        }
    }

    @Override
    public void concatenar(LinkedList<t> l1, LinkedList<t> l2) {
        Node<t> cursor = l1.first;
        Node<t> aux = l2.first;
        if (l1.first == null || l2.first == null) {
            throw new UnsupportedOperationException("Una de las dos o las dos listas estan vacias , por favor revise las listas");
        }
        for (int i = 0; i < l1.size; i++) {
            if (i == size - 1) {
                cursor.next = aux;
            } else {
                cursor = cursor.next;
            }
        }
        size += l2.size;
    }

}
