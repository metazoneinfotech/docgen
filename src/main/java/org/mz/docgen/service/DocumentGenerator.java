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
/**
 * This interface is used to take the File type array and also its path of single
 * and multiple files.All methods of this interface is abstract so that it can be
 * override by implementor class
 * @author Payal
 */
public interface DocumentGenerator {
    /**
     * This method is used to take a single File through File type array selected
     * by user.Function of this method is to take File type array along with their
     * path which is selected by the user.
     * @param files
     * @param destinationFilePath
     * @return int
     */
    int generateSingleDocument(File[] files, File destinationFilePath);
    /**
     * This method is used to take a multiple File through File type array selected
     * by user.Function of this method is to take File type array along with their
     * path which is selected by the user.
     * @param files
     * @param destinationFilePath
     * @return int
     */
    int generateMultipleDocument(File[] files, File destinationFilePath);
}
