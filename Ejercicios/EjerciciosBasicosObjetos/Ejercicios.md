# Ejercicios POO - Encapsulamiento

## Enunciado

En estos ejercicios van a tener que crear los objetos y los métodos necesarios a fin de poder superar los distintos casos de prueba desarrollados para cada ejercicio

## Condiciones

- No tocar nada de las pruebas unitarias utilizadas
- Cada ejercicio posee un paquete, crear las clases y métodos necesarios en los paquetes correspondientes a cada ejercicio
- Los atributos deben ser privados y los mismos encapsulados

## 1 - Figuras

En este ejercicio deben calcular tanto los perímetros como las superficies de:

- Cuadrado
- Circulo
- Triangulo
- Rectángulo

los métodos `perimetro()` y `superficie()` deben ser creados para calcular los mismos en cada una de las figuras.
Para el caso del círculo es importante usar `Math.PI` como constante PI

## 2 - Sims

Un grupo de estudiantes desea recrear los Sims en java y solicitaron tu ayuda para poder desarrollar el mismo.

Un sim posee los siguientes valores:

- Nombre : El nombre del sim

- Salud (Defecto) : El valor de la salud que posee el Sim, por defecto su salud se inicializa en 100

- Hambre (Defecto) : El valor del hambre que posee el Sim, por defecto su hambre se inicializa en 100

- Higiene (Defecto) : El valor de la higiene que posee el Sim, por defecto su higiene se inicializa en 100

- Diversión (Defecto) : El valor de la diversión que posee el Sim, por defecto su diversón se inicializa en 100

Los sim pueden tener como **máximo** puntaje en Salud,Hambre,Higiene y Diversión 100 y como **mínimo** puntaje 0. Es decir, no existen valores superiores a 100 y negativos para los status anteriores

Además un sim posee las siguientes acciones:

- Correr : Cuando un sim corre, su salud se incrementa en 10 y su diversión en 10, pero su hambre se reduce en 20 y su higiene en 10

- Comer : Cuando un sim come, su hambre se incrementa en 20, pero su salud se reduce en 10 y su higiene en 20

- Duchar: Cuando un sim se baña, su higiene se incrementa en 30

- Dormir: Cuando un sim se duerme, su salud se incrementa en 10, pero todas sus otras estadísticas se reducen en 10

En esta primera versión de los sims, debe desarrollar La clase Sim para que cumpla con los requerimientos solicitados