# 02-clean-code

## Instrucciones

Un fabricante de widgets se enfrenta a una demanda inesperadamente alta de su nuevo producto. Quieren satisfacer a tantos clientes como sea posible. Dada la cantidad de widgets disponibles y una lista de pedidos de clientes, ¿cuál es la cantidad máxima de pedidos que el fabricante puede cumplir en su totalidad?

Implementa la función ```filledOrders(List<Long>  orders, long k)```que calcule el máximo de órdenes que se pueden cumplir.  Esta función recibe los siguientes parámetros:
- ```orders```:  Una lista de enteros donde cada item representa la cantidad de widgets del pedido.
- ```k``` : La cantidad de widgets disponibles.

COMANDOS:

GIT:

git clone <repo>
git status
git pull origin <branch>
git add .
git commit -m “<commit message>”
git push origin <branch>

MAVEN:

mvn clean // borra toda la carpeta target
mvn compile // compila archivos java
mvn install // genera el jar(empaquetado)
mvn clean install // genera el jar
mvn verify // corre solo los tests(junit)

CORRER:

mvn exec:java -Dexec.mainClass=“com.lab.Main”
o
mvn exec:java

Librerias Java Utiles:

java.util.Arrays;
java.util.Collections;

# Ejercicio 2:

Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
