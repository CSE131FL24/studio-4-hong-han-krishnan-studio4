package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
        
		StdDraw.setPenColor(StdDraw.RED);
        double[] x = { 0.7, 0.5, 0.3, 0.5 };
        double[] y = { 0.5, 0.3, 0.5, 0.7 };
        StdDraw.filledPolygon(x, y);
        StdDraw.filledCircle(0.6, 0.6, 0.2 / Math.sqrt(2));
        StdDraw.filledCircle(0.4, 0.6, 0.2 / Math.sqrt(2));
        
        StdDraw.setPenColor(StdDraw.PINK);
        double[] a = { 0.6, 0.5, 0.4, 0.5 };
        double[] b = { 0.5, 0.4, 0.5, 0.6 };
        StdDraw.filledPolygon(a, b);
        
        StdDraw.filledCircle(0.55, 0.55, 0.1 / Math.sqrt(2));
        StdDraw.filledCircle(0.45, 0.55, 0.1 / Math.sqrt(2));
        
        
	}
}