/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.docgen.service;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author parii
 */
@RunWith(Parameterized.class)
public class WordDocumentGeneratorTest {
      String resourcesDestination = getClass().getClassLoader().getResource("").getPath();

    WordDocumentGenerator wordDocumentGenerator;
    File[] files;
    String[] input;
    File fileDestination = new File(resourcesDestination + "images/");
    Object expectedOutput;
    boolean expectedBoolean = false;

    public WordDocumentGeneratorTest(String[] input, Object expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input() {
        Object mediaList[][] = new Object[][]{
            {new String[]{"images/1.jpg", "images/2.jpg"},1},
            {new String[]{"images/21.png", "images/27.jpg"},1},
            {new String[]{"images/4.jpg", "images/40.jpg"},1},
            {new String[]{"images/35.png", "images/6.jpg"},1}};
        return Arrays.asList(mediaList);
    }

    @Before
    public void before() {
        wordDocumentGenerator = new WordDocumentGenerator();
        files = new File[input.length];
        for (int i = 0; i < input.length; i++) {
            files[i] = new File(resourcesDestination + input[i]);
        }
         if (expectedOutput instanceof Integer && (Integer) expectedOutput == 1) {
            expectedBoolean = true;
        }
    }

    /**
     * Test of generateSingleDocument method, of class WordDocumentGenerator. 
     */
    @Test
    public void testGenerateSingleDocument() {
       assertEquals(expectedOutput, wordDocumentGenerator.generateSingleDocument(files, fileDestination));
       assertEquals(expectedBoolean, new File(files[0] + ".docx").exists());
        new File(files[0] + ".docx").renameTo(new File(files[0] + "single.docx"));
    }

    /**
     * Test of generateMultipleDocument method, of class WordDocumentGenerator.
     * Expected result
     */
    @Test
    public void testGenerateMultipleDocument() {
        assertEquals(expectedOutput, wordDocumentGenerator.generateMultipleDocument(files, fileDestination));
        for (File file : files) {
            assertEquals(expectedBoolean, new File(file + ".docx").exists());
        }
    }
}
