package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {

    public static void main(String[] args) {
        
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 800);
        StdDraw.setYscale(0, 600);

       
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledRectangle(200, 300, 200, 300);

    
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledRectangle(600, 300, 200, 300);


        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledRectangle(400, 300, 100, 50);

   
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.filledRectangle(400, 325, 60, 25);

       
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(340, 250, 20); 
        StdDraw.filledCircle(460, 250, 20); 

   
        StdDraw.setPenColor(StdDraw.BLACK);
        double thickness = 10;
        StdDraw.rectangle(400, 300, 400 - thickness, 300 - thickness);
    }
}
