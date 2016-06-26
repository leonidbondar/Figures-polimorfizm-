package FiguresObjects;
public class Triangle extends Figure {
	private double firstSide;
	private double secondSide;
	private float angle;

	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
		this.firstSide = param;
		}
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
		this.secondSide = param;
		}
	}

	public float getAngle() {
		return angle;
	}

	public void setAngle() {
		float param = RandomParamsGenerator.floatParam();
		if ((param > 0.0f || param < 1.0f) && Float.isFinite(param)) {
		this.angle = param;
		} else if (param == 0.0) {
			this.angle = 0.01f;
		} else {
			this.angle = 0.99f;
		}
	}

	@Override
	void setSquare() {
		this.square = 0.5 * firstSide * secondSide * Math.sin(angle);

	}

	@Override
	void setFigureName() {
		this.figureName = "Triangle";

	}

	@Override
	void printParams() {
		System.out.print(this.figureName + " square: ");
		System.out.printf("%10.2f", this.square);
		System.out.print(" sq.u");
		System.out.print("	" + this.figureName + " params: " + "firstSide ");
		System.out.printf("%10.2f", this.firstSide);
		System.out.print(" u");
		System.out.print(" secondSide ");
		System.out.printf("%10.2f", this.secondSide);
		System.out.print(" u");
		System.out.print(" angle ");
		System.out.printf("%10.2f", this.angle);
		System.out.print(" u");
		System.out.print(" color 	");
		System.out.println(this.getColor().toString());
		System.out.println();
	}

	@Override
	void setParams() {
		this.setFigureName();
		this.setColor();
		this.setAngle();
		this.setFirstSide();
		this.setSecondSide();		
	}
}
