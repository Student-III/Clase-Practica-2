package com.mycompany.metodosmixtos;

public class MetodosMixtos {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   PRUEBAS DE MÉTODOS NO CONVENCIONALES");
        System.out.println("========================================\n");

        // ============================================
        // PRUEBA 1: deleteDouble - Eliminar duplicados
        // ============================================
        System.out.println(">>> PRUEBA 1: deleteDouble()");
        System.out.println("----------------------------------------");

        LinkedList<String> listaDup = new LinkedList<>();
        listaDup.add("A");
        listaDup.add("B");
        listaDup.add("A");
        listaDup.add("C");
        listaDup.add("A");
        listaDup.add("D");
        listaDup.add("A");

        System.out.println("Lista original: [A, B, A, C, A, D, A]");
        System.out.println("Tamaño antes: " + listaDup.size());

        listaDup.deleteDouble("A");

        System.out.println("Después de deleteDouble('A'):");
        System.out.println("Tamaño después: " + listaDup.size());
        System.out.print("Contenido: [");
        for (int i = 0; i < listaDup.size(); i++) {
            System.out.print(listaDup.get(i));
            if (i < listaDup.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");

        // ============================================
        // PRUEBA 2: deleteDouble con elemento no existente
        // ============================================
        System.out.println(">>> PRUEBA 2: deleteDouble() con elemento inexistente");
        System.out.println("----------------------------------------");

        LinkedList<Integer> listaNum = new LinkedList<>();
        listaNum.add(10);
        listaNum.add(20);
        listaNum.add(30);
        listaNum.add(40);

        System.out.println("Lista original: [10, 20, 30, 40]");
        System.out.println("Tamaño antes: " + listaNum.size());

        listaNum.deleteDouble(99);

        System.out.println("Después de deleteDouble(99):");
        System.out.println("Tamaño después: " + listaNum.size() + " (sin cambios)\n");

        // ============================================
        // PRUEBA 3: deleteDouble eliminando todos
        // ============================================
        System.out.println(">>> PRUEBA 3: deleteDouble() eliminando TODOS los elementos");
        System.out.println("----------------------------------------");

        LinkedList<String> listaTodos = new LinkedList<>();
        listaTodos.add("X");
        listaTodos.add("X");
        listaTodos.add("X");

        System.out.println("Lista original: [X, X, X]");
        try {
            listaTodos.deleteDouble("X");
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // ============================================
        // PRUEBA 4: rotate - Rotar lista
        // ============================================
        System.out.println(">>> PRUEBA 4: rotate()");
        System.out.println("----------------------------------------");

        LinkedList<String> listaRot = new LinkedList<>();
        listaRot.add("1");
        listaRot.add("2");
        listaRot.add("3");
        listaRot.add("4");
        listaRot.add("5");

        System.out.println("Lista original: [1, 2, 3, 4, 5]");
        System.out.println("Esperado tras rotate: [5, 1, 2, 3, 4]");

        listaRot.rotate();

        System.out.print("Resultado real: [");
        for (int i = 0; i < listaRot.size(); i++) {
            System.out.print(listaRot.get(i));
            if (i < listaRot.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");

        // ============================================
        // PRUEBA 5: rotate con lista vacía
        // ============================================
        System.out.println(">>> PRUEBA 5: rotate() con lista vacía");
        System.out.println("----------------------------------------");

        LinkedList<String> listaVacia = new LinkedList<>();
        try {
            listaVacia.rotate();
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // ============================================
        // PRUEBA 6: rotate con un solo elemento
        // ============================================
        System.out.println(">>> PRUEBA 6: rotate() con un solo elemento");
        System.out.println("----------------------------------------");

        LinkedList<String> listaUno = new LinkedList<>();
        listaUno.add("Único");
        try {
            listaUno.rotate();
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // ============================================
        // PRUEBA 7: concatenar - Unir dos listas
        // ============================================
        System.out.println(">>> PRUEBA 7: concatenar()");
        System.out.println("----------------------------------------");

        LinkedList<String> c1 = new LinkedList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");

        LinkedList<String> c2 = new LinkedList<>();
        c2.add("D");
        c2.add("E");
        c2.add("F");

        System.out.println("Lista 1: [A, B, C]");
        System.out.println("Lista 2: [D, E, F]");
        System.out.println("Esperado: [A, B, C, D, E, F]");

        c1.concatenar(c1, c2);
        
        System.out.print("Resultado real: [");
        for (int i = 0; i < c1.size(); i++) {
            System.out.print(c1.get(i));
            if (i < c1.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Tamaño final: " + c1.size() + "\n");

        // ============================================
        // PRUEBA 8: concatenar con lista vacía
        // ============================================
        System.out.println(">>> PRUEBA 8: concatenar() con una lista vacía");
        System.out.println("----------------------------------------");

        LinkedList<String> cv1 = new LinkedList<>();
        cv1.add("A");
        cv1.add("B");

        LinkedList<String> cv2 = new LinkedList<>(); // vacía

        try {
            LinkedList<String> resVacio = new LinkedList<>();
            resVacio.concatenar(cv1, cv2);
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println();

        // ============================================
        // PRUEBA 9: Combinación de métodos
        // ============================================
        System.out.println(">>> PRUEBA 9: Combinación de métodos");
        System.out.println("----------------------------------------");

        LinkedList<Integer> combo = new LinkedList<>();
        combo.add(5);
        combo.add(5);
        combo.add(10);
        combo.add(5);
        combo.add(20);
        combo.add(30);
        combo.add(5);

        System.out.println("Lista original: [5, 5, 10, 5, 20, 30, 5]");
        System.out.println("Tamaño: " + combo.size());

        // Paso 1: eliminar duplicados
        combo.deleteDouble(5);
        System.out.print("Tras deleteDouble(5): [");
        for (int i = 0; i < combo.size(); i++) {
            System.out.print(combo.get(i));
            if (i < combo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Tamaño: " + combo.size());

        // Paso 2: rotar
        combo.rotate();
        System.out.print("Tras rotate(): [");
        for (int i = 0; i < combo.size(); i++) {
            System.out.print(combo.get(i));
            if (i < combo.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Tamaño: " + combo.size() + "\n");

        // ============================================
        // PRUEBA 10: deleteDouble con Integer
        // ============================================
        System.out.println(">>> PRUEBA 10: deleteDouble() con Integer");
        System.out.println("----------------------------------------");

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(1);
        nums.add(4);

        System.out.println("Lista original: [1, 2, 1, 3, 1, 4]");
        nums.deleteDouble(1);
        System.out.print("Tras deleteDouble(1): [");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i < nums.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Tamaño: " + nums.size() + "\n");

        System.out.println("========================================");
        System.out.println("   FIN DE LAS PRUEBAS");
        System.out.println("========================================");
    }
}
