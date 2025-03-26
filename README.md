# POO II en Java
![Java Básico](https://raygun.com/blog/images/oop-concepts-java/feature.png)

La Programación Orientada a Objetos (POO) en Java es un paradigma fundamental que permite la creación de software modular, reutilizable y escalable. En esta segunda parte del aprendizaje sobre POO, profundizaremos en conceptos avanzados como herencia, polimorfismo, enumerados, clases estáticas, generics, y estructuras de datos avanzadas como ArrayList, Map y Set.

## ¿Qué encontrarás en este repositorio?

Este repositorio está diseñado para quienes desean mejorar su comprensión de POO en Java. A través de ejemplos prácticos, se explicarán los siguientes temas clave:

- Herencia: Reutilización de código mediante clases derivadas.

- Polimorfismo: Capacidad de un objeto de comportarse de diferentes maneras según el contexto.

- Enumerados (Enums): Definición de conjuntos de constantes tipadas.

- Clases estáticas: Uso de miembros estáticos para compartir datos y comportamientos comunes.

- Generics (Clases Genéricas): Uso de clases y métodos genéricos para mayor flexibilidad y reutilización del código.

- Estructuras de datos avanzadas:

    - ArrayList: Colección dinámica que permite almacenar y manipular listas de elementos.

    - Map: Estructura clave-valor para asociar datos de manera eficiente.

    - Set: Colección que no permite elementos duplicados, útil para conjuntos únicos.

El objetivo es proporcionar ejemplos claros para visualizar de manera dinámica y práctica estos conceptos avanzados de Java.

## Requisitos

Para ejecutar los ejemplos de este repositorio en tu equipo, necesitarás:
- [Java 8 o superior instalado. JDK 8 (Java SE Development Kit 8)](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- [Apache NetBeans (versión compatible con Java 8)](https://netbeans.apache.org/front/main/download/index.html)

## Ejemplo de lo que vas a encontrar:

A continuación, puedes ver un fragmento de código que demuestra el uso de herencia y polimorfismo en Java:

```Java
package poo2;

// Superclass
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Subclass
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class HerenciaPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Polimorfismo
        miAnimal.hacerSonido(); // Salida: El perro ladra
    }
}
```
Este ejemplo ilustra la herencia de la clase Animal en Perro, y cómo el polimorfismo permite que una variable de tipo Animal ejecute el método sobrescrito en Perro.

## Recursos adicionales:

- [Lección: Conceptos de programación orientada a objetos](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Curso Java. POO II](https://www.youtube.com/watch?v=ZY5pwm92cWQ&ab_channel=pildorasinformaticas)




