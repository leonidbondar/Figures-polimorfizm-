package FiguresObjects;

public class Trapeze extends Figure {
	private double firstBase;
	private double secondBase;
	private double height;

	public double getFirstBase() {
		return firstBase;
	}

	public void setFirstBase() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
			this.firstBase = param;
		}
	}

	public double getSecondBase() {
		return secondBase;
	}

	public void setSecondBase() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
			this.secondBase = param;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
			this.height = param;
		}
	}

	@Override
	void setSquare() {
		this.square = (this.firstBase + this.secondBase) * this.height / 2;
	}

	@Override
	void setFigureName() {
		this.figureName = "Trapeze";
	}

	@Override
	void printParams() {
		System.out.print(this.figureName + " square: ");
		System.out.printf("%10.2f", this.square);
		System.out.print(" sq.u");
		System.out.print("	" + this.figureName + " params: " + "firstBase ");
		System.out.printf("%10.2f", this.firstBase);
		System.out.print(" u");
		System.out.print(" secondBase ");
		System.out.printf("%10.2f", this.secondBase);
		System.out.print(" u");
		System.out.print(" height ");
		System.out.printf("%10.2f", this.height);
		System.out.print(" u");
		System.out.print(" color 	");
		System.out.println(this.getColor().toString());
		System.out.println();
	}

	@Override
	void setParams() {
		this.setFigureName();
		this.setColor();
		this.setHeight();
		this.setFirstBase();
		this.setSecondBase();
	}
}
