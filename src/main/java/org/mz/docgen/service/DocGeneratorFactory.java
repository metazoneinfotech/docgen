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

/**
 * This class is used to take the user input and according to the input 
 * its method calls method of another class to generate specific document.
 * @author Payal
 */
public final class DocGeneratorFactory {

    public static final int PDF = 0;
    public static final int WORD = 1;
    private static final PdfDocumentGenerator PDF_DOCUMENT_GENERATOR = new PdfDocumentGenerator();
    private static final WordDocumentGenerator WORD_DOCUMENT_GENERATOR = new WordDocumentGenerator();
    
    private DocGeneratorFactory(){}
    /**This method checks the user input to generate output file based on the
     * value of parameter.
     * @param DOCTYPE
     * @return DocumentGenerator implementor class
     * 
     */
    public static DocumentGenerator getGenerator(int DOCTYPE) {
        switch (DOCTYPE) {
            case PDF:
                return PDF_DOCUMENT_GENERATOR;
            case WORD:
                return WORD_DOCUMENT_GENERATOR;
            default:
                return null;
        }
    }
}
