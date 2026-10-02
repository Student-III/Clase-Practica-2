Este repositorio contiene una implementación completa de una Lista Enlazada (Linked List) genérica en Java, desarrollada como práctica académica. La implementación incluye operaciones básicas y métodos avanzados como eliminación de duplicados, rotación y concatenación de listas.

El proyecto demuestra el uso de genéricos, interfaces, nodos enlazados y manejo de excepciones en Java.
---------------------------------------------------------------------------------------
📄 Descripción de Clases

🔷 IList<t> — Interfaz
Define el contrato que debe cumplir cualquier implementación de lista.

Descripción

void add(t t)	Agrega un elemento al final de la lista

void add(t t, int index)	Inserta un elemento en una posición específica

t remove(int index)	Elimina y retorna el elemento en la posición indicada

t get(int index)	Obtiene el elemento en la posición indicada

int size()	Retorna el número de elementos

void clear()	Elimina todos los elementos

boolean isEmpty()	Verifica si la lista está vacía

void deleteDouble(t ex)	Elimina todas las ocurrencias de un elemento

void rotate()	Rota la lista (mueve el último elemento al inicio)

void concatenar(LinkedList<t> l1, LinkedList<t> l2)	Concatena dos listas
---------------------------------------------------------------------------------------
🔷 Node<t> — Nodo
Representa un nodo individual de la lista enlazada.

Atributos:

protected t info → Almacena el dato del nodo

protected Node<t> next → Referencia al siguiente nodo

Constructores:

Node(t info) → Crea un nodo sin siguiente

Node(t info, Node<t> next) → Crea un nodo apuntando a otro

Métodos:

getInfo() / setInfo(t info)

getNext() / setNext(Node<t> next)
---------------------------------------------------------------------------------------
🔷 LinkedList<t> — Implementación
Implementación concreta de la lista enlazada simple.

Atributos:

private Node<t> first → Primer nodo de la lista

private int size → Cantidad de elementos

Características principales:

✅ Implementación genérica (funciona con cualquier tipo de dato)

✅ Manejo de excepciones con UnsupportedOperationException

✅ Operaciones con complejidad O(n) en inserción/eliminación

✅ Método clear() reinicia correctamente size = 0

🔷 MetodosMixtos — Clase Principal
Contiene el método main con un ejemplo básico de creación y llenado de dos listas de tipo String.
---------------------------------------------------------------------------------------
⚙️ Requisitos
Java JDK 8 o superior

IDE recomendado: NetBeans, IntelliJ IDEA o Eclipse

Maven (opcional, para gestión de dependencias)
---------------------------------------------------------------------------------------
🔧 Compilación y Ejecución

Desde IDE:
Abrir el proyecto en tu IDE preferido.

Compilar el proyecto.

Ejecutar la clase MetodosMixtos.
---------------------------------------------------------------------------------------
🎯 Objetivos de Aprendizaje

Este proyecto permite practicar:

✅ Estructuras de datos dinámicas (listas enlazadas)

✅ Programación genérica en Java

✅ Uso de interfaces y polimorfismo

✅ Manejo de referencias y punteros

✅ Manejo de excepciones personalizadas
---------------------------------------------------------------------------------------
👤 Autor
Student-III

GitHub: @Student-III
---------------------------------------------------------------------------------------
📝 Licencia
Este proyecto es de uso académico y educativo. Libre para estudiar, modificar y aprender.
---------------------------------------------------------------------------------------
🤝 Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún error o deseas mejorar la implementación:

Haz un Fork del proyecto

Crea una rama (git checkout -b feature/mejora)

Haz commit de tus cambios (git commit -m 'Añadir mejora')

Haz push a la rama (git push origin feature/mejora)

Abre un Pull Request
---------------------------------------------------------------------------------------
⭐ Si este proyecto te fue útil, no olvides darle una estrella en GitHub! ⭐
---------------------------------------------------------------------------------------
Última actualización: Octubre 2026
