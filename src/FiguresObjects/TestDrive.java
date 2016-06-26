package FiguresObjects;

import java.util.ArrayList;

public class TestDrive {
	public static void main(String[] args) {
		ArrayList<Figure> aFigureList = new ArrayList<Figure>();

		for (int i = 0; i < (int) RandomParamsGenerator.doubleParam(); i++) {
			Figure figure = Figure.next();
			figure.setParams();
			figure.setSquare();
			aFigureList.add(figure);
		}
		
		System.out.println(aFigureList.size() + " figures generarated this time: \n");
		
		for (Figure figure : aFigureList) {
			figure.printParams();
		}
		
		if (aFigureList.isEmpty()) {
			System.out.println("No params to display this time");
		}
	}
}
