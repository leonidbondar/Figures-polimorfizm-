package FiguresObjects;

public class Circle extends Figure {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
			this.radius = param;
		}
	}

	@Override
	void setSquare() {
		this.square = Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	void setFigureName() {
		this.figureName = "Circle";
	}

	@Override
	void printParams() {
		System.out.print(this.figureName + " square: ");
		System.out.printf("%10.2f", this.square);
		System.out.print(" sq.u");
		System.out.print("	" + this.figureName + "	params:	" + "radius ");
		System.out.printf("%10.2f", this.radius);
		System.out.print(" u");
		System.out.print(" color 	");
		System.out.println(this.getColor().toString());
		System.out.println();
	}

	@Override
	void setParams() {
		this.setFigureName();
		this.setColor();
		this.setRadius();
	}

}
