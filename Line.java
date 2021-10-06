package com.bl.linecomparison;

public class Line {
   Point p1, p2;
   
   public float getLength() {
	   return (float) Math.sqrt(Math.pow(p1.x - p2.x, 2)+Math.pow(p1.y - p2.y, 2));   
	   }
}
