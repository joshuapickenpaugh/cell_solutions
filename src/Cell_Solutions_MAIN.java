/*
January 28th, 2017
Joshua Pickenpaugh
Unit 3 Assignments: Cell Solutions (MAIN CLASS).
 */

import javax.swing.*;
 
public class Cell_Solutions_MAIN {
    
        //Main entry point for program:
        public static void main(String args[])
        {
            Cell_Solutions cellSolutions = new Cell_Solutions();
            cellSolutions.setTitle("Cell Solutions");
            //Centers the window on start:
            cellSolutions.setLocationRelativeTo(null);
            cellSolutions.setVisible(true);
            cellSolutions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
}
