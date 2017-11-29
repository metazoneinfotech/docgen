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

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import java.io.File;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mz.docgen.constant.Constant;

/**
 * This class generates the pdf file from selected file.
 * @author Payal
 */
public class PdfDocumentGenerator implements DocumentGenerator {

    private static final Logger LOGGER = LogManager.getLogger(PdfDocumentGenerator.class.getName());
    
    /**
     * This method generates pdf file of a single document.
     * @param files
     * @param destination
     * @return result
     */
    @Override
    public int generateSingleDocument(File[] files, File destination) {
        File pdf = new File(destination, files[0].getName() + ".pdf");
        Document pdfDoc = new Document();
        FileOutputStream fos = null;
        int invalidFilesCount=0;
        try {
            fos = new FileOutputStream(pdf);
            PdfWriter.getInstance(pdfDoc, fos);
            pdfDoc.open();
            Image image;
            for (File file : files) { 
                 if (file.exists()) {
                    image = Image.getInstance(file.getAbsolutePath());
                    image.scaleToFit(Constant.CLASS_PDF_SCALE_TO_FIT_WIDTH, Constant.CLASS_PDF_SCALE_TO_FIT_HEIGHT);
                    image.setAbsolutePosition(Constant.CLASS_PDF_ABS_POSITION_FIRST, PageSize.A4.getHeight() - image.getScaledHeight() - Constant.CLASS_PDF_ABS_POSITION_SECOND);
                    image.scaleAbsoluteHeight(Constant.CLASS_PDF_ABS_WIDTH);
                    image.scaleAbsoluteWidth(Constant.CLASS_PDF_ABS_HEIGHT);
                    pdfDoc.add((Element) image);
                    pdfDoc.newPage();
                } else{
                    invalidFilesCount++;
                }
            }
           LOGGER.info("single pdf file generated");
          return 1;
        } catch (DocumentException | IOException ex) {
            LOGGER.error(ex.getMessage(), ex);
        } finally {
             try {
               if(invalidFilesCount!=files.length){
                    pdfDoc.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
        return 0;
    }

    /**
     * This method generates pdf file of multiple document.
     * @param files
     * @param destinationFilePath
     * @return result
     */
    @Override
    public int generateMultipleDocument(File[] files, File destinationFilePath) {
        int result = 0;
        File[] singleFileArray = new File[1];
        for (File file : files) {
            singleFileArray[0] = file;
            result = result + generateSingleDocument(singleFileArray, destinationFilePath);
        }
        if(result!=0){
            LOGGER.info("multiple pdf Files generated");
           return 1;
        } else{
          return 0;
        } 
    }
}
