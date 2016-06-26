package FiguresObjects;

import java.util.Random;

public class RandomParamsGenerator {
	public static double doubleParam() {
		Random rand = new Random();
		double doubleParam = rand.nextDouble() * 100;
		return doubleParam;
	}

	public static float floatParam() {
		Random rand = new Random();
		float floatParam = rand.nextFloat();
		return floatParam;
	}

}
