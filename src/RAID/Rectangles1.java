package RAID;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rectangles1 extends Rectangle {
	int index;
	// public static List<Rectangles> arrMove = Raid0.arrMove;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Rectangles1() {
		super();

		super.setWidth(100);
		super.setHeight(20);
		super.setFill(Color.WHITE);

		super.setStroke(Color.BLACK);
		super.setStrokeWidth(.4);

	}

}
