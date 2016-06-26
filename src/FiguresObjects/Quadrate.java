package FiguresObjects;

public class Quadrate extends Figure {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide() {
		double param = RandomParamsGenerator.doubleParam() + 0.01;
		if (param > 0 && Double.isFinite(param) && param <= Double.MAX_VALUE) {
			this.side = param;
		}
	}

	@Override
	void setSquare() {
		this.square = Math.pow(this.side, 2);
	}

	@Override
	void setFigureName() {
		this.figureName = "Quadrate";
	}

	@Override
	void printParams() {
		System.out.print(this.figureName + " square: ");
		System.out.printf("%10.2f", this.square);
		System.out.print(" sq.u");
		System.out.print("	" + this.figureName + " params: " + "side ");
		System.out.printf("%10.2f", this.side);
		System.out.print(" u");
		System.out.print(" color 	");
		System.out.println(this.getColor().toString());
		System.out.println();
	}

	@Override
	void setParams() {
		this.setFigureName();
		this.setColor();
		this.setSide();
	}

}
