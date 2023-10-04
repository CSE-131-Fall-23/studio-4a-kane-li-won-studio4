package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double o = 0 ;
		double t = 0 ;
		double halfWidth = 0.5 ;
		double halfHeight = 0.25 ;
		
		
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(o, t, halfWidth, halfHeight) ;
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.YELLOW);
		 double[] x = { 0, 0.25, 0.5,};
		 double[] y = { 0, 0.25, 0};
		 StdDraw.polygon(x, y);
		
	}
}