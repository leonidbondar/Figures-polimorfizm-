package FiguresObjects;

import java.awt.Color;

abstract class Figure {
	protected Color color;
	protected double square;
	protected String figureName;

	public Color getColor() {
		return color;
	}

	public void setColor() {
		/*
		 * Color(float r, float g, float b) Creates an opaque sRGB color with
		 * the specified red, green, and blue values in the range (0.0 - 1.0).
		 */
		Color color = new Color(RandomParamsGenerator.floatParam(),
				RandomParamsGenerator.floatParam(),
				RandomParamsGenerator.floatParam());
		this.color = color;
	}

	public double getSquare() {
		return square;
	}

	abstract void setSquare();

	public String getFigureName() {
		return figureName;
	}

	abstract void setFigureName();

	abstract void setParams();

	abstract void printParams();

	public static Figure next() {
		switch ((int) RandomParamsGenerator.doubleParam() % 4) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Quadrate();
		case 2:
			return new Triangle();
		case 3:
			return new Trapeze();
		}
	}

}
