package org.example.aufgaben.aufgabe1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Aufgabe1Test
{
    @Test
    @DisplayName("Filled Rhombus with upperHalf=5")
    public void testPrintRhombusFilled5()
    {
        PrintStream originalOut = System.out;       // System.out merken (Standardausgabegeraet Konsole)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expectedOutput = "     *\n" +
                                "    ***\n" +
                                "   *****\n" +
                                "  *******\n" +
                                " *********\n" +
                                "***********\n" +
                                " *********\n" +
                                "  *******\n" +
                                "   *****\n" +
                                "    ***\n" +
                                "     *\n";
        Aufgabe1.printRhombus(5, true);
        assertEquals(expectedOutput, out.toString(), "should be: \n" + "     *\n" +
                                                                                "    ***\n" +
                                                                                "   *****\n" +
                                                                                "  *******\n" +
                                                                                " *********\n" +
                                                                                "***********\n" +
                                                                                " *********\n" +
                                                                                "  *******\n" +
                                                                                "   *****\n" +
                                                                                "    ***\n" +
                                                                                "     *\n");
        System.setOut(originalOut);                 // System.out wieder auf das Standardausgabegeraet setzen
    }

    @Test
    @DisplayName("Unfilled Rhombus with upperHalf=5")
    public void testPrintRhombusUnfilled5()
    {
        PrintStream originalOut = System.out;       // System.out merken (Standardausgabegeraet Konsole)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expectedOutput = "     *\n" +
                                "    * *\n" +
                                "   *   *\n" +
                                "  *     *\n" +
                                " *       *\n" +
                                "*         *\n" +
                                " *       *\n" +
                                "  *     *\n" +
                                "   *   *\n" +
                                "    * *\n" +
                                "     *\n";
        Aufgabe1.printRhombus(5, false);
        assertEquals(expectedOutput, out.toString(), "should be: \n" + "     *\n" +
                                                                                "    * *\n" +
                                                                                "   *   *\n" +
                                                                                "  *     *\n" +
                                                                                " *       *\n" +
                                                                                "*         *\n" +
                                                                                " *       *\n" +
                                                                                "  *     *\n" +
                                                                                "   *   *\n" +
                                                                                "    * *\n" +
                                                                                "     *\n");
        System.setOut(originalOut);                 // System.out wieder auf das Standardausgabegeraet setzen
    }

    @Test
    @DisplayName("Filled Rhombus with upperHalf=1")
    public void testPrintRhombusFilled1()
    {
        PrintStream originalOut = System.out;       // System.out merken (Standardausgabegeraet Konsole)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expectedOutput = " *\n" +
                                "***\n" +
                                " *\n";
        Aufgabe1.printRhombus(1, true);
        assertEquals(expectedOutput, out.toString(), "should be: \n" + " *\n" +
                                                                                "***\n" +
                                                                                " *\n");
        System.setOut(originalOut);                 // System.out wieder auf das Standardausgabegeraet setzen
    }

    @Test
    @DisplayName("Unfilled Rhombus with upperHalf=1")
    public void testPrintRhombusUnfilled1()
    {
        PrintStream originalOut = System.out;       // System.out merken (Standardausgabegeraet Konsole)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expectedOutput = " *\n" +
                                "* *\n" +
                                " *\n";
        Aufgabe1.printRhombus(1, false);
        assertEquals(expectedOutput, out.toString(), "should be: \n" + " *\n" +
                                                                                "* *\n" +
                                                                                " *\n");
        System.setOut(originalOut);                 // System.out wieder auf das Standardausgabegeraet setzen
    }

}
