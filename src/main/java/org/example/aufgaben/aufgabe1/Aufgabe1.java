package org.example.aufgaben.aufgabe1;

public class Aufgabe1
{
    private static void printNChars(int n, char c)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(c);
        }
    }

    private static void printlnStarNSpacesStar(int n)
    {
        System.out.print("*");
        for (int i = 0; i < n-2; i++)
        {
            System.out.print(" ");
        }
        if(n > 1)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printlnNChars(int n, char c)
    {
        printNChars(n, c);
        System.out.println();
    }
    public static void printRhombusFilled(int upperHalf)
    {
        // obere Haelfte (upperHalf viele Zeilen)
        for (int i = 1; i <= upperHalf; i++)
        {
            printNChars((upperHalf+1-i), ' ');
            printlnNChars((2*i-1), '*');
        }

        // mittlere Zeile (2 * upperHalf + 1 viele Sterne)
        // nur, wenn upprHalf gerade (Hoehe ungerade)
        if(upperHalf % 2 == 1)
        {
            printlnNChars((2 * upperHalf + 1), '*');
        }

        // untere Haelfte (upperHalf viele Zeilen)
        for (int i = upperHalf; i > 0; i--)
        {
            printNChars((upperHalf+1-i), ' ');
            printlnNChars((2*i-1), '*');
        }
    }

    public static void printRhombusUnfilled(int upperHalf)
    {
        // obere Haelfte (upperHalf viele Zeilen)
        for (int i = 1; i <= upperHalf; i++)
        {
            printNChars((upperHalf+1-i), ' ');
            printlnStarNSpacesStar(2*i-1);
        }

        // mittlere Zeile (2 * upperHalf + 1 viele Sterne)
        if(upperHalf % 2 == 1)
        {
            printlnStarNSpacesStar(2 * upperHalf + 1);
        }

        // untere Haelfte (upperHalf viele Zeilen)
        for (int i = upperHalf; i > 0; i--)
        {
            printNChars((upperHalf+1-i), ' ');
            printlnStarNSpacesStar(2*i-1);
        }
    }

    public static void printRhombus(int upperHalf, boolean filled)
    {
        //System.out.printf("-------------- %2d --> %3d-----------------%n", upperHalf, 2 * upperHalf + 1);
        if(filled)
        {
            printRhombusFilled(upperHalf);
        }
        else
        {
            printRhombusUnfilled(upperHalf);
        }
        //System.out.printf("------------------------------------------%n%n");
    }
}
