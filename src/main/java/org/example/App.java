package org.example;

import org.example.aufgaben.aufgabe1.Aufgabe1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void executeAufgabe1()
    {
        System.out.printf( "%n%n-------------- Aufgabe 1 ----------------------%n%n" );
        Aufgabe1.printRhombus( 5, true);
        Aufgabe1.printRhombus( 5, false);

        Aufgabe1.printRhombus( 1, true);
        Aufgabe1.printRhombus( 1, false);

        Aufgabe1.printRhombus( 11, true);
        Aufgabe1.printRhombus( 11, false);
    }
    public static void main( String[] args )
    {
        executeAufgabe1();
    }
}
