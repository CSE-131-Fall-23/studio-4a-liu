package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */


public class InterpretDrawingFile {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("path_to_your_txt_file")); // replace with your file path

        String shapeType = in.next();
        Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt());
        boolean isFilled = in.nextBoolean();

        StdDraw.setPenColor(color);

        switch (shapeType.toLowerCase()) {
            case "rectangle":
            case "ellipse":
                double x = in.nextDouble();
                double y = in.nextDouble();
                double halfWidth = in.nextDouble();
                double halfHeight = in.nextDouble();

                if (shapeType.equalsIgnoreCase("rectangle")) {
                    if (isFilled) StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
                    else StdDraw.rectangle(x, y, halfWidth, halfHeight);
                } else {
                    if (isFilled) StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
                    else StdDraw.ellipse(x, y, halfWidth, halfHeight);
                }
                break;

            case "triangle":
                double[] xs = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
                double[] ys = {in.nextDouble(), in.nextDouble(), in.nextDouble()};

                if (isFilled) StdDraw.filledPolygon(xs, ys);
                else StdDraw.polygon(xs, ys);
                break;
        }

        in.close();
    }
}
