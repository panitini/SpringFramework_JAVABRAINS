package org.kishan;

import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape{
	private Point pointa;
	private Point pointb;
	private Point pointc;


	public Point getPointa() {
		return pointa;
	}


	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}


	public Point getPointb() {
		return pointb;
	}


	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}


	public Point getPointc() {
		return pointc;
	}

	@Required
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}


	@Override
	public void draw() {
		System.out.println("Triangle drawn");
		System.out.println("Point A : " +pointa.getX() +","+pointa.getY());
		System.out.println("Point B : " +pointb.getX() +","+pointb.getY());
		System.out.println("Point C : " +pointc.getX() +","+pointc.getY());

		
	}

}
