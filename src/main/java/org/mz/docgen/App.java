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
package org.mz.docgen;

import javax.swing.UIManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mz.docgen.gui.ApplicationFrame;

/**
 * App class is entry point of Application.
 * @author kunwarmaurya
 */
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class.getName());
    /**
     * Starting point of execution, running application
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
                | javax.swing.UnsupportedLookAndFeelException ex) {
            LOGGER.error(ex.getMessage(), ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new ApplicationFrame().setVisible(true);
                LOGGER.info("Application Started.");
            }
        });
    }
    
}
